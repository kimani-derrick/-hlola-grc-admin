package L;

import android.os.Build;
import android.view.accessibility.AccessibilityNodeInfo;
/* loaded from: classes.dex */
public final class d {

    /* renamed from: e  reason: collision with root package name */
    public static final d f1840e;
    public static final d f;

    /* renamed from: g  reason: collision with root package name */
    public static final d f1841g;

    /* renamed from: h  reason: collision with root package name */
    public static final d f1842h;

    /* renamed from: i  reason: collision with root package name */
    public static final d f1843i;

    /* renamed from: j  reason: collision with root package name */
    public static final d f1844j;

    /* renamed from: k  reason: collision with root package name */
    public static final d f1845k;

    /* renamed from: l  reason: collision with root package name */
    public static final d f1846l;

    /* renamed from: m  reason: collision with root package name */
    public static final d f1847m;
    public static final d n;

    /* renamed from: o  reason: collision with root package name */
    public static final d f1848o;

    /* renamed from: p  reason: collision with root package name */
    public static final d f1849p;

    /* renamed from: a  reason: collision with root package name */
    public final Object f1850a;

    /* renamed from: b  reason: collision with root package name */
    public final int f1851b;

    /* renamed from: c  reason: collision with root package name */
    public final Class f1852c;
    public final s d;

    static {
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction2;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction3;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction4;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction5;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction6;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction7;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction8;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction9;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction10;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction11;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction12;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction13;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction14;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction15;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction16;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction17;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction18;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction19;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction20;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction21;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction22;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction23;
        new d(1);
        new d(2);
        new d(4);
        new d(8);
        f1840e = new d(16);
        new d(32);
        new d(64);
        new d(128);
        new d(256, l.class);
        new d(512, l.class);
        new d(1024, m.class);
        new d(2048, m.class);
        f = new d(4096);
        f1841g = new d(8192);
        new d(16384);
        new d(32768);
        new d(65536);
        new d(131072, q.class);
        f1842h = new d(262144);
        f1843i = new d(524288);
        f1844j = new d(1048576);
        new d(2097152, r.class);
        int i7 = Build.VERSION.SDK_INT;
        new d(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, 16908342, null, null, null);
        f1845k = new d(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, 16908343, null, null, o.class);
        f1846l = new d(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, 16908344, null, null, null);
        f1847m = new d(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, 16908345, null, null, null);
        n = new d(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, 16908346, null, null, null);
        f1848o = new d(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, 16908347, null, null, null);
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction24 = null;
        if (i7 >= 29) {
            accessibilityAction = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP;
        } else {
            accessibilityAction = null;
        }
        new d(accessibilityAction, 16908358, null, null, null);
        if (i7 >= 29) {
            accessibilityAction23 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN;
            accessibilityAction2 = accessibilityAction23;
        } else {
            accessibilityAction2 = null;
        }
        new d(accessibilityAction2, 16908359, null, null, null);
        if (i7 >= 29) {
            accessibilityAction3 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT;
        } else {
            accessibilityAction3 = null;
        }
        new d(accessibilityAction3, 16908360, null, null, null);
        if (i7 >= 29) {
            accessibilityAction22 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT;
            accessibilityAction4 = accessibilityAction22;
        } else {
            accessibilityAction4 = null;
        }
        new d(accessibilityAction4, 16908361, null, null, null);
        new d(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, 16908348, null, null, null);
        if (i7 >= 24) {
            accessibilityAction21 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS;
            accessibilityAction5 = accessibilityAction21;
        } else {
            accessibilityAction5 = null;
        }
        new d(accessibilityAction5, 16908349, null, null, p.class);
        if (i7 >= 26) {
            accessibilityAction6 = AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW;
        } else {
            accessibilityAction6 = null;
        }
        new d(accessibilityAction6, 16908354, null, null, n.class);
        if (i7 >= 28) {
            accessibilityAction20 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP;
            accessibilityAction7 = accessibilityAction20;
        } else {
            accessibilityAction7 = null;
        }
        new d(accessibilityAction7, 16908356, null, null, null);
        if (i7 >= 28) {
            accessibilityAction19 = AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP;
            accessibilityAction8 = accessibilityAction19;
        } else {
            accessibilityAction8 = null;
        }
        new d(accessibilityAction8, 16908357, null, null, null);
        if (i7 >= 30) {
            accessibilityAction9 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD;
        } else {
            accessibilityAction9 = null;
        }
        new d(accessibilityAction9, 16908362, null, null, null);
        if (i7 >= 30) {
            accessibilityAction18 = AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER;
            accessibilityAction10 = accessibilityAction18;
        } else {
            accessibilityAction10 = null;
        }
        new d(accessibilityAction10, 16908372, null, null, null);
        if (i7 >= 32) {
            accessibilityAction11 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START;
        } else {
            accessibilityAction11 = null;
        }
        new d(accessibilityAction11, 16908373, null, null, null);
        if (i7 >= 32) {
            accessibilityAction17 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP;
            accessibilityAction12 = accessibilityAction17;
        } else {
            accessibilityAction12 = null;
        }
        new d(accessibilityAction12, 16908374, null, null, null);
        if (i7 >= 32) {
            accessibilityAction16 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL;
            accessibilityAction13 = accessibilityAction16;
        } else {
            accessibilityAction13 = null;
        }
        new d(accessibilityAction13, 16908375, null, null, null);
        if (i7 >= 33) {
            accessibilityAction15 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS;
            accessibilityAction14 = accessibilityAction15;
        } else {
            accessibilityAction14 = null;
        }
        new d(accessibilityAction14, 16908376, null, null, null);
        if (i7 >= 34) {
            accessibilityAction24 = g.a();
        }
        f1849p = new d(accessibilityAction24, 16908382, null, null, null);
    }

    public d(int i7) {
        this(null, i7, null, null, null);
    }

    public final int a() {
        return ((AccessibilityNodeInfo.AccessibilityAction) this.f1850a).getId();
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof d)) {
            return false;
        }
        Object obj2 = ((d) obj).f1850a;
        Object obj3 = this.f1850a;
        if (obj3 == null) {
            if (obj2 != null) {
                return false;
            }
            return true;
        } else if (!obj3.equals(obj2)) {
            return false;
        } else {
            return true;
        }
    }

    public final int hashCode() {
        Object obj = this.f1850a;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AccessibilityActionCompat: ");
        String d = i.d(this.f1851b);
        if (d.equals("ACTION_UNKNOWN")) {
            Object obj = this.f1850a;
            if (((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel() != null) {
                d = ((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel().toString();
            }
        }
        sb.append(d);
        return sb.toString();
    }

    public d(int i7, Class cls) {
        this(null, i7, null, null, cls);
    }

    public d(Object obj, int i7, String str, s sVar, Class cls) {
        this.f1851b = i7;
        this.d = sVar;
        this.f1850a = obj == null ? new AccessibilityNodeInfo.AccessibilityAction(i7, str) : obj;
        this.f1852c = cls;
    }
}
