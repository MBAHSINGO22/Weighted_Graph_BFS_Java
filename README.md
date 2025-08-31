# Weighted Graph BFS Java

Implementasi Graf Berbobot dengan BFS dan DFS di Java.

## Deskripsi Proyek
Proyek Java yang mengimplementasikan graf berbobot dengan matriks adjacensi dan algoritma BFS menggunakan queue serta DFS menggunakan stack.

### Fitur Utama
- **Vertex.java**: Kelas dasar untuk vertex dengan label karakter dan flag kunjungan.
- **Queue.java**: Kelas utilitas untuk implementasi queue berbasis LinkedList.
- **Graph.java**: Kelas utama untuk mengelola graf dengan metode `addVertex`, `addEdge`, `print`, `dfs`, dan `bfs`.
- **GraphMain.java**: Kelas utama untuk menguji dua graf: graf pertama (6 vertex: A-F) dan graf kedua (9 vertex: A-I), menampilkan matriks adjacensi dan hasil BFS.

## Teknologi
- Java

## Struktur File
```
Weighted_Graph_BFS_Java/
├── src/PERTEMUAN10/
├── GraphMain.java           # Kelas utama untuk pengujian
├── Graph.java               # Kelas untuk graf dan traversal
├── Vertex.java              # Kelas vertex
├── Queue.java               # Kelas queue berbasis LinkedList
```

## Catatan
- Maksimum 10 vertex, matriks adjacensi diisi `-1` untuk edge yang tidak ada.
- BFS menggunakan queue, DFS menggunakan stack.

## Contoh Output
```
BFS Traversal Graph 1 :
A B C D E F 

BFS Traversal Graph 2 :
A B F I C E G D H
```

## Pengembang
- MBAHSINGO22 ([GitHub](https://github.com/MBAHSINGO22))
