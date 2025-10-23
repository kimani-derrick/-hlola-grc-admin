package I;
/* loaded from: classes.dex */
public final class a {

    /* renamed from: e  reason: collision with root package name */
    public static final byte[] f1187e = new byte[1792];

    /* renamed from: a  reason: collision with root package name */
    public final CharSequence f1188a;

    /* renamed from: b  reason: collision with root package name */
    public final int f1189b;

    /* renamed from: c  reason: collision with root package name */
    public int f1190c;
    public char d;

    static {
        for (int i7 = 0; i7 < 1792; i7++) {
            f1187e[i7] = Character.getDirectionality(i7);
        }
    }

    public a(CharSequence charSequence) {
        this.f1188a = charSequence;
        this.f1189b = charSequence.length();
    }

    public final byte a() {
        CharSequence charSequence = this.f1188a;
        char charAt = charSequence.charAt(this.f1190c - 1);
        this.d = charAt;
        if (Character.isLowSurrogate(charAt)) {
            int codePointBefore = Character.codePointBefore(charSequence, this.f1190c);
            this.f1190c -= Character.charCount(codePointBefore);
            return Character.getDirectionality(codePointBefore);
        }
        this.f1190c--;
        char c5 = this.d;
        if (c5 < 1792) {
            return f1187e[c5];
        }
        return Character.getDirectionality(c5);
    }
}
