package N3;
/* loaded from: classes.dex */
public final class c extends b {

    /* renamed from: q  reason: collision with root package name */
    public final char f2492q;

    public c(char c5) {
        this.f2492q = c5;
    }

    @Override // N3.b
    public final boolean b(char c5) {
        if (c5 == this.f2492q) {
            return true;
        }
        return false;
    }

    public final String toString() {
        char[] cArr = new char[6];
        cArr[0] = '\\';
        cArr[1] = 'u';
        cArr[2] = 0;
        cArr[3] = 0;
        cArr[4] = 0;
        cArr[5] = 0;
        char c5 = this.f2492q;
        for (int i7 = 0; i7 < 4; i7++) {
            cArr[5 - i7] = "0123456789ABCDEF".charAt(c5 & 15);
            c5 = (char) (c5 >> 4);
        }
        String copyValueOf = String.copyValueOf(cArr);
        StringBuilder sb = new StringBuilder(String.valueOf(copyValueOf).length() + 18);
        sb.append("CharMatcher.is('");
        sb.append(copyValueOf);
        sb.append("')");
        return sb.toString();
    }
}
