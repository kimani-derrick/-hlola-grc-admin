package Y5;
/* loaded from: classes.dex */
public abstract class i {

    /* renamed from: a  reason: collision with root package name */
    public static final h f4534a = new Object();

    public static b a(int i7, int i8, int i9) {
        b mVar;
        if ((i9 & 2) != 0) {
            i8 = 1;
        }
        if (i7 != -2) {
            if (i7 != -1) {
                if (i7 != 0) {
                    if (i7 != Integer.MAX_VALUE) {
                        if (i8 == 1) {
                            return new b(i7, null);
                        }
                        return new m(i7, i8, null);
                    }
                    return new b(Integer.MAX_VALUE, null);
                } else if (i8 == 1) {
                    mVar = new b(0, null);
                } else {
                    mVar = new m(1, i8, null);
                }
            } else if (i8 == 1) {
                return new m(1, 2, null);
            } else {
                throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow".toString());
            }
        } else if (i8 == 1) {
            f.d.getClass();
            mVar = new b(e.f4532b, null);
        } else {
            mVar = new m(1, i8, null);
        }
        return mVar;
    }
}
