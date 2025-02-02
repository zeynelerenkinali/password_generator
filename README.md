# Password Generator

This is a simple password generator that produces a random password based on user preferences such as length, case (upper, lower, or both), and inclusion of special and numerical characters.

---

## Features

- **Length Choice**: User can choose the length of the password (1-50 characters).
- **Case Preferences**: User can select between uppercase, lowercase, or mixed case.
- **Special Characters**: Option to include special characters in the password.
- **Numerical Characters**: Option to include numbers in the password.

---

## Usage

1. Clone the repository:
   ```bash
    git clone https://github.com/yourusername/password-generator.git cd password-generator
   ```
2. Run the script:
    ```bash
    python password_generator.py
   ```
3. Follow the prompts to specify your preferences:
- Enter the desired password length.
- Choose case preference: uppercase (ABC), lowercase (abc), or mixed case (AbC).
- Choose whether to include special characters.
- Choose whether to include numbers.

4. The generated password will be displayed based on your selections.

---

## Example Output
```bash
||Password Generator||
Welcome to password generator, according to your preferences, it will produce random password! Let's Start
Length(1-50): 9
Case preference (ABC(u), abc(l), AbC(b)): b
Special character preference (y/n): y
Numerical character preference (y/n): y

Password generated!
W`Rj[?~t8
```

---

## License

This project is licensed under the [MIT License](https://opensource.org/licenses/MIT).
