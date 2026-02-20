# Alternate Case Pattern

[![Instagram](https://img.shields.io/badge/Instagram-%40lacopydepastel-E4405F?style=for-the-badge&logo=instagram&logoColor=white)](https://www.instagram.com/lacopydepastel)
[![YouTube](https://img.shields.io/badge/YouTube-%40rvorine-FF0000?style=for-the-badge&logo=youtube&logoColor=white)](https://www.youtube.com/@rvorine)

> 👍 Like & Subscribe to support the channel!

---

## Problem

Given a string, convert it into an **alternate case pattern** where:
- The **first letter** is uppercase.
- Each subsequent letter **alternates** between uppercase and lowercase.
- Non-letter characters (spaces, digits, punctuation) are left unchanged and **do not affect the alternation state**.

### Example

| Input | Output |
|-------|--------|
| `instagram` | `InStAgRaM` |
| `hello world` | `HeLlO wOrLd` |
| `abc123def` | `AbC123DeF` |

---

## Solution Approach

Instead of using parity (even/odd index), a single **boolean state variable** `makeUpper` is used:

1. Initialise `makeUpper = true`.
2. Iterate over every character in the string.
3. If the character is a **letter**:
   - Apply the current case (`makeUpper` → uppercase, otherwise lowercase).
   - **Toggle** `makeUpper`.
4. If the character is **not a letter**, leave it as-is and **do not toggle** the state.

This keeps the logic clean, readable, and easy to extend.

---

## Implementations

| Language | File |
|----------|------|
| Kotlin | [`kotlin/AlternateCase.kt`](kotlin/AlternateCase.kt) |
| Java | [`java/AlternateCase.java`](java/AlternateCase.java) |
| C | [`c/alternate_case.c`](c/alternate_case.c) |
| C# | [`csharp/AlternateCase.cs`](csharp/AlternateCase.cs) |
| Python | [`python/alternate_case.py`](python/alternate_case.py) |
| JavaScript | [`javascript/alternateCase.js`](javascript/alternateCase.js) |