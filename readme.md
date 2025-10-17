# UTS PBO - Plants vs Zombies Game Simulation

## 📹 Video Tutorial

<div align="center">
  
### [▶️ **KLIK UNTUK MENONTON VIDEO TUTORIAL** ▶️](https://github.com/hafisc/UTS-PBO/raw/main/readme.mp4)

[![Download Video](https://img.shields.io/badge/📥_Download-Video_Tutorial-FF0000?style=for-the-badge&logo=youtube&logoColor=white)](https://github.com/hafisc/UTS-PBO/raw/main/readme.mp4)
[![Video Size](https://img.shields.io/badge/Size-29MB-blue?style=for-the-badge)](https://github.com/hafisc/UTS-PBO/raw/main/readme.mp4)
[![Format](https://img.shields.io/badge/Format-MP4-green?style=for-the-badge)](https://github.com/hafisc/UTS-PBO/raw/main/readme.mp4)

**Video ini berisi tutorial lengkap tentang implementasi Plants vs Zombies Game**

</div>

---

## 📝 Deskripsi Project
Project ini adalah implementasi sistem game simulasi **Plants vs Zombies** menggunakan konsep Object-Oriented Programming (OOP) dalam bahasa Java. Project ini mendemonstrasikan penggunaan interface, abstract class, inheritance, dan polymorphism.

## 🎯 Fitur Utama
- **Interface Destroyable**: Kontrak untuk objek yang dapat dihancurkan
- **Abstract Class Zombie**: Base class untuk berbagai tipe zombie
- **Concrete Classes**:
  - `WalkingZombie`: Zombie yang berjalan dengan kemampuan heal berbeda per level
  - `JumpingZombie`: Zombie yang melompat dengan kemampuan heal lebih tinggi
  - `Barrier`: Penghalang dengan strength yang dapat berkurang
  - `Plant`: Tanaman yang dapat menghancurkan objek Destroyable

## 🏗️ Struktur Class
```
Destroyable (Interface)
    ├── Zombie (Abstract Class)
    │   ├── WalkingZombie
    │   └── JumpingZombie
    └── Barrier

Plant (Class)
```

## 🔧 Cara Menjalankan

### Main.java
```bash
javac Main.java
java Main
```

### Tester.java
```bash
javac Tester.java
java Tester
```

## 📚 Konsep OOP yang Diimplementasikan

### 1. **Interface**
- `Destroyable` dengan method `destroyed()`

### 2. **Abstract Class**
- `Zombie` dengan method abstract `heal()`
- Method helper: `addPct()`, `subPct()`, `getZombieInfo()`

### 3. **Inheritance**
- `WalkingZombie` extends `Zombie`
- `JumpingZombie` extends `Zombie`

### 4. **Polymorphism**
- Method `doDestroy()` di class `Plant` menerima parameter `Destroyable`
- Implementasi berbeda untuk `WalkingZombie` dan `JumpingZombie`

### 5. **Encapsulation**
- Private attribute `strength` di class `Barrier`
- Protected attributes `health` dan `level` di class `Zombie`

## 📊 Detail Mekanik Game

### Zombie Healing
| Zombie Type | Level 1 | Level 2 | Level 3 |
|-------------|---------|---------|---------|------|
| Walking     | +20%    | +30%    | +40%    |
| Jumping     | +30%    | +40%    | +50%    |

### Damage Mekanik
- **WalkingZombie**: -20% health saat destroyed
- **JumpingZombie**: -10% health saat destroyed
- **Barrier**: -9 strength saat destroyed



## 👨‍💻 Author
**Hafis**
- GitHub: [@hafisc](https://github.com/hafisc)
- Repository: [UTS-PBO](https://github.com/hafisc/UTS-PBO)

## 📄 License
Project ini dibuat untuk keperluan UTS Pemrograman Berorientasi Objek.
