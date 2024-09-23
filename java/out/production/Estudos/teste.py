import numpy as np


def sigmoid(x):
    return 1 / (1 + np.exp(-x))

def sigmoid_derivative(x):
    return x * (1 - x)


X = np.array([[0, 0, 1],
              [1, 1, 1],
              [1, 0, 1],
              [0, 1, 1]])


y = np.array([[0], [1], [1], [0]])


np.random.seed(1)
pesos_sinapse = 2 * np.random.random((3, 1)) - 1


taxa_aprendizado = 10000

for i in range(taxa_aprendizado):
    

    entrada_camada = X
    saida_camada = sigmoid(np.dot(entrada_camada, pesos_sinapse))
    

    erro = y - saida_camada
    

    ajustes = erro * sigmoid_derivative(saida_camada)
    

    pesos_sinapse += np.dot(entrada_camada.T, ajustes)


print("Saída após o treinamento:")
print(saida_camada)
