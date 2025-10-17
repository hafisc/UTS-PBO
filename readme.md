# UTS PBO 

## Cara Menjalankan

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

## Konsep OOP yang Diimplementasikan

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


## 👨‍💻 Author
**Hafis**
- GitHub: [@hafisc](https://github.com/hafisc)
- Repository: [UTS-PBO](https://github.com/hafisc/UTS-PBO)

