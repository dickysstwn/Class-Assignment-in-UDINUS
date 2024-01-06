print("Latihan UAS Dasar Pemrograman")
print("-----------------------------------------------")
print("Nama: Dicky Setiawan")
print("NIM: A11.2020.13089")
print("Kelompok: A11.4114")
print("----------------------------------------------")
print("Soal Nomor 3")
print("----------------------------------------------")

'''
Program untuk menginputkan sepuluh bilangan bulat. 
Keseluruhan data tersebut disimpan dalam list. 
Selanjutnya program mencetak nilai rata-rata dan daftar nilai yang lebih besar dari nilai rata-ratanya.
'''

daftar = []

print('Masukkan 10 Data Bilangan bulat :')
for i in range(10):
    r = int(input('Bilangan {} = '.format(i+1)))
    daftar.append(r)
b = sum(daftar)/10
print('Rata-rata = ', b)
for i in daftar:
    if i > b:
        print('Nilai di atas rata-rata = ', i)