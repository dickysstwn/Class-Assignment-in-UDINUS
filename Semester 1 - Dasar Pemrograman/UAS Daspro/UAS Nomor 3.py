print("Ujian Akhir Semester Dasar Pemrograman")
print("-----------------------------------------------")
print("Nama: Dicky Setiawan")
print("NIM: A11.2020.13089")
print("Kelompok: A11.4114")
print("----------------------------------------------")
print("Soal Nomor 3")
print("----------------------------------------------")

'''
Buatlah skrip menginputkan dan menampilkan sejumlah n-data untuk list A dan dan list B, 
kemudian program menampilkan nilai-nilai data yang terdapat di kedua list A dan B (nilai yang beriirisan), 
lalu menampilkan hasil penjumlahan nilai ganjil, nilai genap dan total genap ditambah ganjil dari data yang ditampilkan tersebut.
'''

n = int(input("Masukkan jumlah n: "))
a = []
b = []
for i in range(n):
    a.append([])
    b.append([])

for j in range(n):
    bil = int(input("Bilangan A {}: ".format(j+1)))
    a[i].append(bil)
for j in range(n):
    bil = int(input("Bilangan B {}: ".format(j+1)))
    b[i].append(bil)

print(a[i])
print(b[i])

c = set(a[i])
d = set(b[i]) #Set berfungsi sebagai pengubah menjadi {}

e = c & d
f = list(e)
print("Nilai Nilai Yang Berisan Pada List A dan List B:",f)
genap = []
ganjil = []
for i in range(len(f)):
    if i % 2 == 0:
        # print(i, end=' ')
        genap.append(i)
    else:
        ganjil.append(i)
print('Jumlah nilai-nilai beririsan yang genap saja', *genap, '=', sum(genap))
print('Jumlah nilai-nilai beririsan yang ganjil saja', *ganjil, '=', sum(ganjil))
total = sum(genap) + sum(ganjil)
print('Total genap+ganjil = ', sum(genap), '+', sum(ganjil) ,'=', total)