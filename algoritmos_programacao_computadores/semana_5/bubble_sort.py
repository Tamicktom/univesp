"""
Implementação do algoritmo bubble sort em python
"""

def bubble_sort(v):
  for i in range(len(v) - 1):
    for j in range(len(v) - i - 1):
      if(v[j] > v[j+1]):
        v[j], v[j+1] = v[j+1], v[j]

unnordered_vector = [2,5,7,8,3,6,1,9,3]

print("Vetor não ordenado: ")
print(unnordered_vector)

bubble_sort(unnordered_vector)

print("Vetor ordenado: ")
print(unnordered_vector)