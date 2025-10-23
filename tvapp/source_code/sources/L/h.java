package L;

import android.view.accessibility.AccessibilityNodeInfo;
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    public final Object f1853a;

    public h(AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo) {
        this.f1853a = collectionItemInfo;
    }

    public static h a(boolean z7, int i7, int i8, int i9, int i10) {
        return new h(AccessibilityNodeInfo.CollectionItemInfo.obtain(i7, i8, i9, i10, false, z7));
    }
}
