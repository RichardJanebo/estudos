const Tesseract = require('tesseract.js');
const sharp = require('sharp');
const nlp = require('compromise');

const imagePath = 'C:\\Users\\SeuCaminho';
const processedImagePath = 'C:\\Users\\seuCaminho';

sharp(imagePath)
  .resize(800)
  .grayscale()
  .normalize()
  .toFile(processedImagePath, (err) => {
    if (err) {
      console.error('Erro ao processar a imagem:', err);
      return;
    }

    Tesseract.recognize(
      processedImagePath,
      'por',
      { logger: info => console.log(info) }
    ).then(({ data: { text } }) => {
      console.log('Texto extraído da imagem:\n', text);
      
      const entities = nlp(text).people().out('array');
      const dados = processarTexto(text, entities);
      console.log('Dados organizados:');
      imprimirDados(dados);
    }).catch(err => {
      console.error(err);
    });
  });

function processarTexto(texto, entities) {
  const dados = {};

  const rgPattern = /(\d{1,2}\.\d{3}\.\d{3}-\d{1})/;
  const dataExpedicaoPattern = /(\d{1,2}\/[A-Z]{3}\/\d{4})/;
  const naturalidadePattern = /NATURALIDADE\s*([\w\s]+-\s[A-Z]{2})/;
  const dataNascimentoPattern = /(\d{1,2}\/[A-Z]{3}\/\d{4})/g;
  const cpfPattern = /(\d{3}\.\d{3}\.\d{3}-\d{2})/;

  dados['Registro Geral'] = texto.match(rgPattern)?.[1] || '';
  dados['Data de Expedição'] = texto.match(dataExpedicaoPattern)?.[1] || '';
  
  const datasNascimento = texto.match(dataNascimentoPattern);
  dados['Data de Nascimento'] = datasNascimento && datasNascimento.length > 1 ? datasNascimento[1] : '';
  dados['Naturalidade'] = texto.match(naturalidadePattern)?.[1]?.trim() || '';
  dados['CPF'] = texto.match(cpfPattern)?.[1] || '';

  if (entities.length > 0) {
    dados['Nome'] = entities[0] || '';
    dados['Filiação'] = entities.slice(1).join(', ') || '';
  }

  return dados;
}

function imprimirDados(dados) {
  for (const [key, value] of Object.entries(dados)) {
    console.log(`${key}: ${value}`);
  }
}
