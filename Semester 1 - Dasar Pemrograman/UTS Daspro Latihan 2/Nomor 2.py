baris = int(input('Masukkan Baris : '))
kolom = int(input('Masukkan Kolom : '))
n=1
for b in range(0,baris) :
   for k in range(0,kolom) :
      print(n, end=" ")
      n+=1
   print(" ")