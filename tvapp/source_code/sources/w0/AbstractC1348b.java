package w0;

import android.view.View;
import java.util.concurrent.ExecutorService;
/* renamed from: w0.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1348b {

    /* renamed from: b  reason: collision with root package name */
    public static ExecutorService f15509b;

    /* renamed from: a  reason: collision with root package name */
    public static final Object f15508a = new Object();

    /* renamed from: c  reason: collision with root package name */
    public static final n5.r f15510c = new n5.r(3);

    public static int c(g0 g0Var, androidx.emoji2.text.f fVar, View view, View view2, U u7, boolean z7) {
        if (u7.y() != 0 && g0Var.b() != 0 && view != null && view2 != null) {
            if (!z7) {
                return Math.abs(U.O(view) - U.O(view2)) + 1;
            }
            return Math.min(fVar.l(), fVar.b(view2) - fVar.e(view));
        }
        return 0;
    }

    public static int d(g0 g0Var, androidx.emoji2.text.f fVar, View view, View view2, U u7, boolean z7, boolean z8) {
        int max;
        if (u7.y() == 0 || g0Var.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        int min = Math.min(U.O(view), U.O(view2));
        int max2 = Math.max(U.O(view), U.O(view2));
        if (z8) {
            max = Math.max(0, (g0Var.b() - max2) - 1);
        } else {
            max = Math.max(0, min);
        }
        if (!z7) {
            return max;
        }
        return Math.round((max * (Math.abs(fVar.b(view2) - fVar.e(view)) / (Math.abs(U.O(view) - U.O(view2)) + 1))) + (fVar.k() - fVar.e(view)));
    }

    public static int e(g0 g0Var, androidx.emoji2.text.f fVar, View view, View view2, U u7, boolean z7) {
        if (u7.y() != 0 && g0Var.b() != 0 && view != null && view2 != null) {
            if (!z7) {
                return g0Var.b();
            }
            return (int) (((fVar.b(view2) - fVar.e(view)) / (Math.abs(U.O(view) - U.O(view2)) + 1)) * g0Var.b());
        }
        return 0;
    }

    public abstract boolean a(Object obj, Object obj2);

    public abstract boolean b(Object obj, Object obj2);
}
