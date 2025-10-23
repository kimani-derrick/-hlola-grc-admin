package T;

import K.C0026b;
import K.O;
import L.i;
import L4.f;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.chip.Chip;
import java.lang.reflect.Field;
import java.util.ArrayList;
/* loaded from: classes.dex */
public abstract class b extends C0026b {
    public static final Rect n = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);

    /* renamed from: o  reason: collision with root package name */
    public static final f f3166o = new f(9);

    /* renamed from: p  reason: collision with root package name */
    public static final J3.e f3167p = new J3.e(10);

    /* renamed from: h  reason: collision with root package name */
    public final AccessibilityManager f3170h;

    /* renamed from: i  reason: collision with root package name */
    public final View f3171i;

    /* renamed from: j  reason: collision with root package name */
    public a f3172j;
    public final Rect d = new Rect();

    /* renamed from: e  reason: collision with root package name */
    public final Rect f3168e = new Rect();
    public final Rect f = new Rect();

    /* renamed from: g  reason: collision with root package name */
    public final int[] f3169g = new int[2];

    /* renamed from: k  reason: collision with root package name */
    public int f3173k = Integer.MIN_VALUE;

    /* renamed from: l  reason: collision with root package name */
    public int f3174l = Integer.MIN_VALUE;

    /* renamed from: m  reason: collision with root package name */
    public int f3175m = Integer.MIN_VALUE;

    public b(View view) {
        if (view != null) {
            this.f3171i = view;
            this.f3170h = (AccessibilityManager) view.getContext().getSystemService("accessibility");
            view.setFocusable(true);
            Field field = O.f1447a;
            if (view.getImportantForAccessibility() == 0) {
                view.setImportantForAccessibility(1);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("View may not be null");
    }

    @Override // K.C0026b
    public final K3.f b(View view) {
        if (this.f3172j == null) {
            this.f3172j = new a(this);
        }
        return this.f3172j;
    }

    @Override // K.C0026b
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        super.c(view, accessibilityEvent);
    }

    @Override // K.C0026b
    public final void d(View view, i iVar) {
        String str;
        View.AccessibilityDelegate accessibilityDelegate = this.f1466a;
        AccessibilityNodeInfo accessibilityNodeInfo = iVar.f1854a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        Chip chip = ((B3.d) this).f193q;
        accessibilityNodeInfo.setCheckable(chip.e());
        accessibilityNodeInfo.setClickable(chip.isClickable());
        if (!chip.e() && !chip.isClickable()) {
            str = "android.view.View";
        } else if (chip.e()) {
            str = "android.widget.CompoundButton";
        } else {
            str = "android.widget.Button";
        }
        iVar.i(str);
        iVar.n(chip.getText());
    }

    public final boolean j(int i7) {
        if (this.f3174l != i7) {
            return false;
        }
        this.f3174l = Integer.MIN_VALUE;
        B3.d dVar = (B3.d) this;
        if (i7 == 1) {
            Chip chip = dVar.f193q;
            chip.f8820C = false;
            chip.refreshDrawableState();
        }
        q(i7, 8);
        return true;
    }

    public final i k(int i7) {
        boolean z7;
        AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain();
        i iVar = new i(obtain);
        obtain.setEnabled(true);
        obtain.setFocusable(true);
        iVar.i("android.view.View");
        Rect rect = n;
        obtain.setBoundsInParent(rect);
        obtain.setBoundsInScreen(rect);
        iVar.f1855b = -1;
        View view = this.f3171i;
        obtain.setParent(view);
        o(i7, iVar);
        if (iVar.g() == null && obtain.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        Rect rect2 = this.f3168e;
        iVar.f(rect2);
        if (!rect2.equals(rect)) {
            int actions = obtain.getActions();
            if ((actions & 64) == 0) {
                if ((actions & 128) == 0) {
                    obtain.setPackageName(view.getContext().getPackageName());
                    iVar.f1856c = i7;
                    obtain.setSource(view, i7);
                    if (this.f3173k == i7) {
                        obtain.setAccessibilityFocused(true);
                        iVar.a(128);
                    } else {
                        obtain.setAccessibilityFocused(false);
                        iVar.a(64);
                    }
                    if (this.f3174l == i7) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    if (z7) {
                        iVar.a(2);
                    } else if (obtain.isFocusable()) {
                        iVar.a(1);
                    }
                    obtain.setFocused(z7);
                    int[] iArr = this.f3169g;
                    view.getLocationOnScreen(iArr);
                    Rect rect3 = this.d;
                    obtain.getBoundsInScreen(rect3);
                    if (rect3.equals(rect)) {
                        iVar.f(rect3);
                        if (iVar.f1855b != -1) {
                            i iVar2 = new i(AccessibilityNodeInfo.obtain());
                            for (int i8 = iVar.f1855b; i8 != -1; i8 = iVar2.f1855b) {
                                iVar2.f1855b = -1;
                                AccessibilityNodeInfo accessibilityNodeInfo = iVar2.f1854a;
                                accessibilityNodeInfo.setParent(view, -1);
                                accessibilityNodeInfo.setBoundsInParent(rect);
                                o(i8, iVar2);
                                iVar2.f(rect2);
                                rect3.offset(rect2.left, rect2.top);
                            }
                        }
                        rect3.offset(iArr[0] - view.getScrollX(), iArr[1] - view.getScrollY());
                    }
                    Rect rect4 = this.f;
                    if (view.getLocalVisibleRect(rect4)) {
                        rect4.offset(iArr[0] - view.getScrollX(), iArr[1] - view.getScrollY());
                        if (rect3.intersect(rect4)) {
                            iVar.f1854a.setBoundsInScreen(rect3);
                            if (!rect3.isEmpty() && view.getWindowVisibility() == 0) {
                                ViewParent parent = view.getParent();
                                while (true) {
                                    if (parent instanceof View) {
                                        View view2 = (View) parent;
                                        if (view2.getAlpha() <= 0.0f || view2.getVisibility() != 0) {
                                            break;
                                        }
                                        parent = view2.getParent();
                                    } else if (parent != null) {
                                        obtain.setVisibleToUser(true);
                                    }
                                }
                            }
                        }
                    }
                    return iVar;
                }
                throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            }
            throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
    }

    public abstract void l(ArrayList arrayList);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0105  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m(int r20, android.graphics.Rect r21) {
        /*
            Method dump skipped, instructions count: 494
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: T.b.m(int, android.graphics.Rect):boolean");
    }

    public final i n(int i7) {
        if (i7 == -1) {
            View view = this.f3171i;
            AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(view);
            i iVar = new i(obtain);
            Field field = O.f1447a;
            view.onInitializeAccessibilityNodeInfo(obtain);
            ArrayList arrayList = new ArrayList();
            l(arrayList);
            if (obtain.getChildCount() > 0 && arrayList.size() > 0) {
                throw new RuntimeException("Views cannot have both real and virtual children");
            }
            int size = arrayList.size();
            for (int i8 = 0; i8 < size; i8++) {
                iVar.f1854a.addChild(view, ((Integer) arrayList.get(i8)).intValue());
            }
            return iVar;
        }
        return k(i7);
    }

    public abstract void o(int i7, i iVar);

    public final boolean p(int i7) {
        int i8;
        View view = this.f3171i;
        if ((!view.isFocused() && !view.requestFocus()) || (i8 = this.f3174l) == i7) {
            return false;
        }
        if (i8 != Integer.MIN_VALUE) {
            j(i8);
        }
        if (i7 == Integer.MIN_VALUE) {
            return false;
        }
        this.f3174l = i7;
        B3.d dVar = (B3.d) this;
        if (i7 == 1) {
            Chip chip = dVar.f193q;
            chip.f8820C = true;
            chip.refreshDrawableState();
        }
        q(i7, 8);
        return true;
    }

    public final void q(int i7, int i8) {
        View view;
        ViewParent parent;
        AccessibilityEvent obtain;
        if (i7 == Integer.MIN_VALUE || !this.f3170h.isEnabled() || (parent = (view = this.f3171i).getParent()) == null) {
            return;
        }
        if (i7 != -1) {
            obtain = AccessibilityEvent.obtain(i8);
            i n7 = n(i7);
            obtain.getText().add(n7.g());
            AccessibilityNodeInfo accessibilityNodeInfo = n7.f1854a;
            obtain.setContentDescription(accessibilityNodeInfo.getContentDescription());
            obtain.setScrollable(accessibilityNodeInfo.isScrollable());
            obtain.setPassword(accessibilityNodeInfo.isPassword());
            obtain.setEnabled(accessibilityNodeInfo.isEnabled());
            obtain.setChecked(accessibilityNodeInfo.isChecked());
            if (obtain.getText().isEmpty() && obtain.getContentDescription() == null) {
                throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
            }
            obtain.setClassName(accessibilityNodeInfo.getClassName());
            obtain.setSource(view, i7);
            obtain.setPackageName(view.getContext().getPackageName());
        } else {
            obtain = AccessibilityEvent.obtain(i8);
            view.onInitializeAccessibilityEvent(obtain);
        }
        parent.requestSendAccessibilityEvent(view, obtain);
    }

    public final void r(int i7) {
        int i8 = this.f3175m;
        if (i8 == i7) {
            return;
        }
        this.f3175m = i7;
        q(i7, 128);
        q(i8, 256);
    }
}
