package K;

import android.view.View;
import w0.k0;
/* renamed from: K.p  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0040p {

    /* renamed from: a  reason: collision with root package name */
    public int f1501a;

    /* renamed from: b  reason: collision with root package name */
    public int f1502b;

    public /* synthetic */ C0040p(int i7, int i8) {
        this.f1501a = i7;
        this.f1502b = i8;
    }

    public int a() {
        int i7 = this.f1502b;
        if (i7 != 2) {
            if (i7 != 5) {
                if (i7 != 29) {
                    if (i7 != 42) {
                        if (i7 != 22) {
                            if (i7 != 23) {
                                return 0;
                            }
                            return 15;
                        }
                        return 1073741824;
                    }
                    return 16;
                }
                return 12;
            }
            return 11;
        }
        return 10;
    }

    public void b(k0 k0Var) {
        View view = k0Var.f15576a;
        this.f1501a = view.getLeft();
        this.f1502b = view.getTop();
        view.getRight();
        view.getBottom();
    }
}
