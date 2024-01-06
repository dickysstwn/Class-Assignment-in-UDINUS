print("Latihan UTS Dasar Pemrograman")
print("-----------------------------------------------")
print("Nama: Dicky Setiawan")
print("NIM: A11.2020.13089")
print("Kelompok: A11.4114")
print("----------------------------------------------")
print("Soal Nomor 2")
print("----------------------------------------------")

#Algoritma Pemrograman untuk Membuat Program Penjualan Susu

nama = input('Masukkan Nama Pembeli : ')
kode = input('Masukkan Kode Susu [1/2/3] : ')
ukuran = input('Masukkan Kode Ukuran [S/M/L] : ')
jumlahbeli = int(input('Masukkan Jumlah Beli : '))

if kode == '1':
    merk = 'Indomilk'
    if ukuran == 'S':
        harga=5000
    elif ukuran == 'M':
        harga=7500
    elif ukuran == 'L':
        harga=9500
    else:
        print('Error, tidak sesuai pilihan !')
elif kode == '2':
    merk = 'Dancow'
    if ukuran == 'S':
        harga=4500
    elif ukuran == 'M':
        harga=6500
    elif ukuran == 'L':
        harga=8500
elif kode == '3':
    merk = 'Susu Sustagen'
    if ukuran == 'S':
        harga=9500
    elif ukuran == 'M':
        harga=15500
    elif ukuran == 'L':
        harga=19500
    else:
        print('Error, tidak sesuai pilihan !')
else:
    print('Error, tidak sesuai pilihan !')

jumlahpembayaran = jumlahbeli * harga

if jumlahbeli > 25:
    diskon = jumlahpembayaran * (5/100)
else:
    diskon = 0

pajak = jumlahpembayaran * (10/100)

total = jumlahpembayaran + pajak - diskon

print('STRUK PEMBAYARAN')
print('Nama Pembeli         :', nama)
print('Merk Barang          :', merk)
print('Jenis Ukuran         :', ukuran)
print('Jumlah Beli          :', jumlahbeli)
print('Harga Barang         :', harga)
print('Jumlah Pembayaran    :', jumlahpembayaran)
print('Potongan             :', diskon)
print('Pajak                :', pajak)
print('Total Pembayaran     :', total)