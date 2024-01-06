print("Ujian Akhir Semester Dasar Pemrograman")
print("-----------------------------------------------")
print("Nama: Dicky Setiawan")
print("NIM: A11.2020.13089")
print("Kelompok: A11.4114")
print("----------------------------------------------")
print("Soal Nomor 1")
print("----------------------------------------------")

'''
Buatlah skrip untuk menginputkan sembarang nilai string lalu menampilkan seperti contoh output berikut : Masukkan String : UDINUS
'''

n = str(input("Masukkan String :"))

for i in range (len(n)):
    print (" " * i,end="")
    for j in range(i,len(n)):
        print(n[j],end="")
    print()