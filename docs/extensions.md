# 🧩 File Extensions Reference

This document lists the file extensions currently supported by the Java File Organizer and their corresponding destination folders. You can update this list as your categorization logic evolves or add new types for broader support.

---

## 📷 Images
| Extension     | Category       |
|---------------|----------------|
| `.jpg`        | Images         |
| `.jpeg`       | Images         |
| `.png`        | Images         |
| `.gif`        | Images         |
| `.bmp`        | Images         |
| `.webp`       | Images         |
| `.svg`        | VectorImages   |

---

## 📄 Documents
| Extension     | Category       |
|---------------|----------------|
| `.pdf`        | Documents      |
| `.doc`        | WordDocs       |
| `.docx`       | WordDocs       |
| `.xls`, `.xlsx`| ExcelSheets   |
| `.ppt`, `.pptx`| Presentations |
| `.odt`        | OpenDocs       |
| `.rtf`        | TextFiles      |
| `.txt`        | TextFiles      |

---

## 🎶 Audio
| Extension     | Category       |
|---------------|----------------|
| `.mp3`        | Audio          |
| `.wav`        | Audio          |
| `.flac`       | Audio          |
| `.aac`        | Audio          |
| `.m4a`        | Audio          |

---

## 🎥 Video
| Extension     | Category       |
|---------------|----------------|
| `.mp4`        | Videos         |
| `.mkv`        | Videos         |
| `.avi`        | Videos         |
| `.mov`        | Videos         |
| `.wmv`        | Videos         |

---

## 👨‍💻 Code & Scripts
| Extension     | Category       |
|---------------|----------------|
| `.java`       | SourceCode     |
| `.class`      | Bytecode       |
| `.py`         | SourceCode     |
| `.cpp`, `.c`  | SourceCode     |
| `.js`         | Scripts        |
| `.html`       | Web            |
| `.css`        | Web            |
| `.json`       | Config         |
| `.xml`        | Config         |

---

## 🖥️ Executables & System Files
| Extension     | Category           |
|---------------|--------------------|
| `.exe`        | Executables        |
| `.dll`        | NativeLibraries    |
| `.sys`        | SystemFiles        |
| `.bat`        | Scripts            |
| `.msi`        | Installers         |

---

## 📦 Archives & Packages
| Extension     | Category       |
|---------------|----------------|
| `.zip`        | Archives       |
| `.rar`        | Archives       |
| `.tar`, `.gz` | Archives       |
| `.7z`         | Archives       |
| `.iso`        | DiskImages     |

---

## 🔁 Miscellaneous
| Extension     | Category       |
|---------------|----------------|
| `.log`        | Logs           |
| `.ini`        | Config         |
| `.db`         | Databases      |
| `.torrent`    | PeerSharing    |
| `.xyz`        | Misc           |
| _no extension_| Unknown        |

---

> 💡 Tip: Extensions are matched using lowercase comparison. If you want to support additional formats, add them to your project's `typeMap` in `FileOrganizer.java`.
