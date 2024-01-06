print("KASUS 1 - Soal Ujian \n")
# Algoritma pemrograman untuk menentukan tipe soal ujian
# NIM genap = Tipe A, NIM ganjil = Tipe B
print("Contoh input-output 1 (masukkan NIM genap) \n")
n = int(input("NIM :"))

if n % 2 == 0:
    print("Tipe A")
else:
    print("Tipe B")
print("Contoh input-output 2 (masukkan NIM ganjil) \n")
n = int(input("NIM :"))

if n % 2 == 0:
    print("Tipe A")
else:
    print("Tipe B")