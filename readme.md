# UTS PBO - Plants vs Zombies Game Simulation

## 📹 Video Tutorial

<video src="https://github.com/hafisc/UTS-PBO/raw/main/readme.mp4" controls width="100%">
  Your browser does not support the video tag.
</video>

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

## 🎮 Contoh Output

### Main.java Output:
```
JumpingZombie kalah!
Barrier kalah!
WalkingZombie kalah!
```

### Tester.java Output:
```
Walking Zombie Data =
Health = 100
Level = 1

Jumping Zombie Data =
Health = 100
Level = 2

Barrier Strength = 100

--------------------------
Walking Zombie Data =
Health = 42
Level = 1

Jumping Zombie Data =
Health = 66
Level = 2

Barrier Strength = 64
```

## 👨‍💻 Author
**Hafis**
- GitHub: [@hafisc](https://github.com/hafisc)
- Repository: [UTS-PBO](https://github.com/hafisc/UTS-PBO)

## 📄 License
Project ini dibuat untuk keperluan UTS Pemrograman Berorientasi Objek.

---

⭐ Jangan lupa untuk star repository ini jika bermanfaat!