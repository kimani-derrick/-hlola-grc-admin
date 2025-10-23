package N3;
/* loaded from: classes.dex */
public abstract class b implements h {
    public int a(int i7, CharSequence charSequence) {
        int length = charSequence.length();
        android.support.v4.media.session.b.l(i7, length);
        while (i7 < length) {
            if (b(charSequence.charAt(i7))) {
                return i7;
            }
            i7++;
        }
        return -1;
    }

    @Override // N3.h
    public final boolean apply(Object obj) {
        return b(((Character) obj).charValue());
    }

    public abstract boolean b(char c5);
}
