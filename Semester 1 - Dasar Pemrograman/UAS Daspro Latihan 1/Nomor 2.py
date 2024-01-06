print("Latihan UAS Dasar Pemrograman")
print("-----------------------------------------------")
print("Nama: Dicky Setiawan")
print("NIM: A11.2020.13089")
print("Kelompok: A11.4114")
print("----------------------------------------------")
print("Soal Nomor 2")
print("----------------------------------------------")

'''
Dengan menggunakan list berisi nama-nama bulan dalam satu tahun, 
buatlah program untuk meminta kode bulan yang diinput dari keyboard, dan kemudian menampilkan nama bulan.
Contoh output 1:
Penentuan Nama Bulan
----------------------------------
Kode Bulan (1 .. 12) : 2
Bulan Desember
Contoh Output 2 :
Penentuan Nama Bulan
----------------------------------
Kode Bulan (1 .. 12) : 15
Kode bulan harus antara 1 sampai 12
'''

a = [
    'Januari',
    'Februari',
    'Maret',
    'April',
    'Mei',
    'Juni',
    'Juli',
    'Agustus',
    'September',
    'Oktober',
    'November',
    'Desember',
]
print('Penentuan Nama Bulan')
w = int(input('kode bulan (1..2): '))
if 0<w<=12:
    if w==1:
        print(a[0])
    elif w==2:
        print(a[1])
    elif w==3:
        print(a[2])
    elif w==4:
        print(a[3])
    elif w==5:
        print(a[4])
    elif w==6:
        print(a[5])
    elif w==7:
        print(a[6])
    elif w==8:
        print(a[7])
    elif w==9:
        print(a[8])
    elif w==10:
        print(a[9])
    elif w==11:
        print(a[10])
    else:
        print(a[11])
else:
    print('masukan 1-12')