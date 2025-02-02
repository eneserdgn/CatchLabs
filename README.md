# 🚀 CatchLabs Test Otomasyon Projesi

![Java](https://img.shields.io/badge/Java-11%2B-blue)
![Maven](https://img.shields.io/badge/Maven-3.6%2B-orange)
![Selenium](https://img.shields.io/badge/Selenium-4.0%2B-brightgreen)
![TestNG](https://img.shields.io/badge/TestNG-7.6%2B-red)

Cucumber, Java ve Selenium tabanlı modern UI test framework'ü.  
[**GitHub'da Görüntüle**](https://github.com/eneserdgn/CatchLabs/tree/master)

---

## ✨ Temel Özellikler
- ✔️ **BDD (Behavior-Driven Development)** - Gherkin syntax ile test senaryoları
- ✔️ **Page Object Model (POM)** - Modüler ve sürdürülebilir kod yapısı
- ✔️ **Cross-Browser Test** - Chrome/Firefox/Edge desteği
- ✔️ **Paralel Test Çalıştırma** - TestNG ile thread yönetimi
- ✔️ **Dinamik Konfigürasyon** - `config.properties` ile ortam ayarları
- ✔️ **Zengin Raporlama** - HTML/JSON formatında detaylı raporlar

---

## 📂 Proje Yapısı
```bash
CatchLabs/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── utils/              # Yardımcı metodlar (DriverSetup, ConfigReader)
│   │   └── resources/
│   │       └── config.properties   # Browser & URL konfigürasyonları
│   └── test/
│       ├── java/
│       │   ├── pages/              # Page sınıfları (LoginPage, HomePage)
│       │   ├── pageObjects/        # Web element locator'ları
│       │   ├── stepDefinitions/    # Cucumber step tanımları
│       │   └── runner/             # TestNG test koşucuları
│       └── resources/
│           ├── features/           # .feature dosyaları (Gherkin senaryoları)
├── pom.xml                         # Maven bağımlılıkları
├── testng.xml                      # Paralel test konfigürasyonu
└── README.md
```

---

## 🛠️ Kurulum Rehberi

### 📋 Ön Gereksinimler
- **Java JDK 11+** ([İndirme Linki](https://www.oracle.com/java/technologies/downloads/))
- **Maven 3.6+** ([Kurulum Kılavuzu](https://maven.apache.org/install.html))
- **IDE** (IntelliJ IDEA önerilir - [İndir](https://www.jetbrains.com/idea/))
- **Git** ([İndirme Linki](https://git-scm.com/))

---

### 🔧 Adım Adım Kurulum

1. **Repoyu Klonlayın**  
   Terminalde aşağıdaki komutu çalıştırın:
   ```bash
   git clone https://github.com/eneserdgn/CatchLabs.git
   cd CatchLabs

2. **Bağımlılıkları Yükleyin**  
   Proje dizininde Maven komutunu çalıştırın:
   ```bash
   mvn clean install

3. **Konfigürasyon Dosyasını Ayarlayın**  
   src/main/resources/config.properties dosyasını düzenleyin:
   ```bash
   # Tarayıcı seçimi (Chrome/Firefox/Safari)
    browser=Chrome

4. **IDE'de Projeyi Açın**  

    IntelliJ IDEA'da:
    - File > Open > pom.xml seçin
    - "Open as Project" seçeneğini tıklayın
    - Maven bağımlılıklarının otomatik yüklendiğinden emin olun

