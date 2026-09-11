# Week 2 - S2 Java Practice Problems

This repository contains five Java programs covering loops, strings, character
validation, arrays, `StringBuilder`, and formatted output.

## Programs

1. **Vowel and Consonant Counter**
   - Counts vowels and consonants in a title while ignoring spaces.
2. **CSV Student Record Parser**
   - Validates and formats a three-field student record.
3. **File Extension Validator**
   - Accepts `pdf`, `docx`, and `zip` extensions without case sensitivity.
4. **Masked Phone Number Formatter**
   - Validates a ten-digit phone number and masks its first six digits.
5. **Bank Transaction Reference Generator and Validator**
   - Normalizes, validates, and formats a fourteen-character transaction reference.

## Compile

From the repository root, run:

```powershell
Get-ChildItem -Directory Question* | ForEach-Object {
    Push-Location $_.FullName
    javac *.java
    Pop-Location
}
```

Each command creates a `.class` file beside its `.java` file.

## Run

```powershell
java -cp Question1_VowelConsonantCounter VowelConsonantCounter
java -cp Question2_CSVStudentRecordParser CSVStudentRecordParser
java -cp Question3_FileExtensionValidator FileExtensionValidator
java -cp Question4_MaskedPhoneNumberFormatter MaskedPhoneNumberFormatter
java -cp Question5_BankTransactionReference BankTransactionReference
```