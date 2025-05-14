public String getSignature() {
    if (firstName.equals("") || null) {
        return lastName;
    }
    return firstName.substring(0, 1) + "-" + lastName;
}

public String addSignature(String text) {
    String sig = getSignature();
    int sigLen = sig.length();
    int textLen = text.length();

    if (textLen >= sigLen) {
        if (text.substring(textLen - sigLen).equals(sig)) {
            return text;
        }
        if (text.substring(0, sigLen).equals(sig)) {
            return text.substring(sigLen) + sig;
        }
    }

    return text + sig;
}
