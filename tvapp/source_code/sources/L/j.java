package L;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;
/* loaded from: classes.dex */
public class j extends AccessibilityNodeProvider {

    /* renamed from: a  reason: collision with root package name */
    public final K3.f f1857a;

    public j(K3.f fVar) {
        this.f1857a = fVar;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i7) {
        i a7 = this.f1857a.a(i7);
        if (a7 == null) {
            return null;
        }
        return a7.f1854a;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final List findAccessibilityNodeInfosByText(String str, int i7) {
        this.f1857a.getClass();
        return null;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo findFocus(int i7) {
        i b7 = this.f1857a.b(i7);
        if (b7 == null) {
            return null;
        }
        return b7.f1854a;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final boolean performAction(int i7, int i8, Bundle bundle) {
        return this.f1857a.e(i7, i8, bundle);
    }
}
