package T;

import L.i;
import L4.f;
import android.graphics.Rect;
import java.util.Comparator;
/* loaded from: classes.dex */
public final class c implements Comparator {

    /* renamed from: q  reason: collision with root package name */
    public final Rect f3176q = new Rect();

    /* renamed from: r  reason: collision with root package name */
    public final Rect f3177r = new Rect();

    /* renamed from: s  reason: collision with root package name */
    public final boolean f3178s;

    /* renamed from: t  reason: collision with root package name */
    public final f f3179t;

    public c(boolean z7, f fVar) {
        this.f3178s = z7;
        this.f3179t = fVar;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        this.f3179t.getClass();
        Rect rect = this.f3176q;
        ((i) obj).f(rect);
        Rect rect2 = this.f3177r;
        ((i) obj2).f(rect2);
        int i7 = rect.top;
        int i8 = rect2.top;
        if (i7 < i8) {
            return -1;
        }
        if (i7 > i8) {
            return 1;
        }
        int i9 = rect.left;
        int i10 = rect2.left;
        boolean z7 = this.f3178s;
        if (i9 < i10) {
            if (!z7) {
                return -1;
            }
            return 1;
        } else if (i9 > i10) {
            if (z7) {
                return -1;
            }
            return 1;
        } else {
            int i11 = rect.bottom;
            int i12 = rect2.bottom;
            if (i11 < i12) {
                return -1;
            }
            if (i11 > i12) {
                return 1;
            }
            int i13 = rect.right;
            int i14 = rect2.right;
            if (i13 < i14) {
                if (!z7) {
                    return -1;
                }
                return 1;
            } else if (i13 > i14) {
                if (z7) {
                    return -1;
                }
                return 1;
            } else {
                return 0;
            }
        }
    }
}
