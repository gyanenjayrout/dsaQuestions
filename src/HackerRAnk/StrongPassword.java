package HackerRAnk;

public class StrongPassword {
	 public static void main(String[] args) {
	        System.out.println(minCharsToStrongPassword("Ab1")); // Output: 3
	    }
// Strong Password (Check if a password meets all requirements)
	 
	 
	private static int minCharsToStrongPassword(String string) {
		// TODO Auto-generated method stub
		
		int n= string.length();
		
		
		boolean hasLower = false;
		boolean hasupper = false;
		
		boolean hasDigit = false;
		
		boolean hasSpecialchracter = false;
		
		String sprecialCracter = "!@#$%^&*()-+";
		
		for(char ch : string.toCharArray())
		{
			if(Character.isUpperCase(ch)) hasupper = true;
			else if(Character.isLowerCase(ch)) hasLower = true;
			else if(Character.isDigit(ch)) hasDigit = true;
			else if(sprecialCracter.contains(String.valueOf(ch))) hasSpecialchracter = true;
		}
		
		int missingChracter = 0;
		
		if(!hasupper) missingChracter++;
		if(!hasDigit) missingChracter++;
		if(!hasLower) missingChracter++;
		if(!hasSpecialchracter) missingChracter++;
		
		
		
		return Math.max(missingChracter, 6-n);
		
		//Why Use Math.max?
//
//	    Ensures the password meets both the minimum length and character diversity requirements.
//
//	    Handles cases where the password is too short or lacks character types efficiently.
	}

}

/*String specialCharacters = "!@#$%^&*()-+";

    This defines a string containing all the special characters that are considered valid for a strong password.

String.valueOf(c)

    This converts the character c into a String.

    This is necessary because contains() works with Strings, not char.

specialCharacters.contains(String.valueOf(c))

    contains() checks if specialCharacters includes the string representation of c.

    If c is one of !@#$%^&*()-+, it returns true; otherwise, it returns false.

hasSpecial = true;

    If contains() returns true, it means c is a special character.

    We then set hasSpecial to true to mark that the password contains at least one special character.
    
    
    
    
    ### **Explanation of `return Math.max(missingCriteria, 6 - n);`**
This line is used to **determine the minimum number of characters that need to be added** to make the password strong. 

### **Breaking It Down**
1. **`n`** → The length of the password.
2. **`missingCriteria`** → The number of missing character types (uppercase, lowercase, digit, special character).
3. **`6 - n`** → The number of characters needed to make the password at least 6 characters long.
4. **`Math.max(missingCriteria, 6 - n)`**:
   - If the password is already 6 or more characters long (`n >= 6`), return `missingCriteria`.
   - If the password is too short (`n < 6`), return **the larger of**:
     - `missingCriteria` (how many types of characters are missing).
     - `6 - n` (how many characters need to be added to reach length 6).

---

### **Example Walkthrough**
#### **Case 1: Password = `"abc"` (Too Short, Missing Requirements)**
- `n = 3`
- **Missing character types**:
  - **No uppercase** ❌
  - **No digit** ❌
  - **No special character** ❌
- `missingCriteria = 3`
- `6 - n = 6 - 3 = 3`
- **Final Output**: `Math.max(3, 3) = 3` → **Need to add 3 characters.**

#### **Case 2: Password = `"abc123"` (Long Enough, But Weak)**
- `n = 6`
- **Missing character types**:
  - **No uppercase** ❌
  - **No special character** ❌
- `missingCriteria = 2`
- `6 - n = 6 - 6 = 0`
- **Final Output**: `Math.max(2, 0) = 2` → **Need to add 2 characters.**

#### **Case 3: Password = `"A1@bcd"` (Already Strong)**
- `n = 6`
- **Has all character types** ✅
- `missingCriteria = 0`
- `6 - n = 6 - 6 = 0`
- **Final Output**: `Math.max(0, 0) = 0` → **No changes needed.**

---

### **Why Use `Math.max`?**
- Ensures the password meets **both** the **minimum length** and **character diversity** requirements.
- **Handles cases where the password is too short or lacks character types efficiently**.

---

### **Final Summary**
- **Ensures the password has at least 6 characters.**
- **Ensures the password includes at least one of each required character type.**
- **Returns the minimum number of characters that need to be added to make the password strong.** 🚀
 * 
 */
