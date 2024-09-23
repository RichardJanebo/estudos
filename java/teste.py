import numpy as np

# Função sigmoide e sua derivada
def sigmoid(x):
    return 1 / (1 + np.exp(-x))

def sigmoid_derivative(x):
    return x * (1 - x)

# Matriz de entrada (4 amostras de 3 características)
X = np.array([[0, 0, 1],
              [1, 1, 1],xcg
              [1, 0, 1],
              [0, 1, 1]])

# Saída esperada (classificação binária)
y = np.array([[0], [1], [1], [0]])

# Inicializar pesos aleatórios com média 0
np.random.seed(1)
pesos_sinapse = 2 * np.random.random((3, 1)) - 1

# Taxa de aprendizado e número de iterações
taxa_aprendizado = 10000

for i in range(taxa_aprendizado):
    
    # Propagação para frente
    entrada_camada = X
    saida_camada = sigmoid(np.dot(entrada_camada, pesos_sinapse))
    
    # Cálculo do erro
    erro = y - saida_camada
    
    # Ajuste dos pesos (retropropagação)
    ajustes = erro * sigmoid_derivative(saida_camada)
    
    # Atualização dos pesos
    pesos_sinapse += np.dot(entrada_camada.T, ajustes)

# Exibir a saída após o treinamento
print("Saída após o treinamento:")
print(saida_camada)
