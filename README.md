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

🛠️ Kurulum Rehberi
Ön Gereksinimler
Java JDK 17+

Maven 3.6+

IDE (IntelliJ IDEA önerilir)

Git

Adım Adım Kurulum
Repoyu klonlayın:

bash
Copy
git clone https://github.com/eneserdgn/CatchLabs.git
cd CatchLabs
Bağımlılıkları yükleyin:

bash
Copy
mvn clean install
Browser konfigürasyonunu ayarlayın (src/main/resources/config.properties):

properties
Copy
browser=chrome
baseUrl=https://ornek-site.com
⚡ Testleri Çalıştırma
Temel Komutlar
Komut	Açıklama
mvn test	Tüm testleri çalıştır
mvn test -Dcucumber.filter.tags="@smoke"	Sadece @smoke tag'li testleri çalıştır
mvn test -Dbrowser=firefox	Firefox'ta testleri çalıştır
Paralel Çalıştırma
testng.xml dosyasını düzenleyerek thread sayısını ayarlayın:

xml
Copy
<suite name="Parallel Suite" parallel="tests" thread-count="3">
Run HTML
📊 Raporlama Sistemi
Test sonuçları otomatik olarak oluşturulur:

bash
Copy
target/
├── cucumber-html-reports/  # Detaylı HTML raporlar
└── cucumber.json           # JSON formatında ham veri
Raporları görüntülemek için cucumber-html-reports klasöründeki overview-features.html dosyasını tarayıcıda açın.

🤝 Katkıda Bulunma
Repoyu fork edin

Yeni branch oluşturun:
git checkout -b feature/yeni-özellik

Değişiklikleri commit edin:
git commit -m 'Yeni özellik eklendi: ...'

Branch'i push edin:
git push origin feature/yeni-özellik

GitHub üzerinden Pull Request açın

📜 Lisans Bilgisi
Bu proje MIT lisansı ile lisanslanmıştır. Detaylar için LICENSE dosyasını inceleyin.

Test Otomasyon Keyifli Olsun! 🧪🚀
Enes Erdogan tarafından geliştirilmiştir.
