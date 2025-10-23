package O3;

import java.util.Comparator;
/* renamed from: O3.v  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0077v extends AbstractC0079x {
    public static AbstractC0079x f(int i7) {
        if (i7 < 0) {
            return AbstractC0079x.f2711b;
        }
        if (i7 > 0) {
            return AbstractC0079x.f2712c;
        }
        return AbstractC0079x.f2710a;
    }

    @Override // O3.AbstractC0079x
    public final AbstractC0079x a(int i7, int i8) {
        int i9;
        if (i7 < i8) {
            i9 = -1;
        } else if (i7 > i8) {
            i9 = 1;
        } else {
            i9 = 0;
        }
        return f(i9);
    }

    @Override // O3.AbstractC0079x
    public final AbstractC0079x b(Object obj, Object obj2, Comparator comparator) {
        return f(comparator.compare(obj, obj2));
    }

    @Override // O3.AbstractC0079x
    public final AbstractC0079x c(boolean z7, boolean z8) {
        int i7;
        if (z7 == z8) {
            i7 = 0;
        } else if (z7) {
            i7 = 1;
        } else {
            i7 = -1;
        }
        return f(i7);
    }

    @Override // O3.AbstractC0079x
    public final AbstractC0079x d(boolean z7, boolean z8) {
        int i7;
        if (z8 == z7) {
            i7 = 0;
        } else if (z8) {
            i7 = 1;
        } else {
            i7 = -1;
        }
        return f(i7);
    }

    @Override // O3.AbstractC0079x
    public final int e() {
        return 0;
    }
}
