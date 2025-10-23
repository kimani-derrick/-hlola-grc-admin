package K;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import com.boxhdo.android.tv.R;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public abstract class O {

    /* renamed from: a  reason: collision with root package name */
    public static Field f1447a = null;

    /* renamed from: b  reason: collision with root package name */
    public static boolean f1448b = false;

    /* renamed from: c  reason: collision with root package name */
    public static final int[] f1449c = {R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};
    public static final C0048y d = new Object();

    /* renamed from: e  reason: collision with root package name */
    public static final A f1450e = new A();

    public static View.AccessibilityDelegate a(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return I.a(view);
        }
        if (f1448b) {
            return null;
        }
        if (f1447a == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f1447a = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f1448b = true;
                return null;
            }
        }
        Object obj = f1447a.get(view);
        if (!(obj instanceof View.AccessibilityDelegate)) {
            return null;
        }
        return (View.AccessibilityDelegate) obj;
    }

    public static ArrayList b(View view) {
        ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_accessibility_actions);
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList();
            view.setTag(R.id.tag_accessibility_actions, arrayList2);
            return arrayList2;
        }
        return arrayList;
    }

    public static String[] c(View view) {
        if (Build.VERSION.SDK_INT >= 31) {
            return K.a(view);
        }
        return (String[]) view.getTag(R.id.tag_on_receive_content_mime_types);
    }

    public static void d(View view, int i7) {
        Object tag;
        boolean z7;
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (!accessibilityManager.isEnabled()) {
            return;
        }
        int i8 = Build.VERSION.SDK_INT;
        CharSequence charSequence = null;
        if (i8 >= 28) {
            tag = H.b(view);
        } else {
            tag = view.getTag(R.id.tag_accessibility_pane_title);
            if (!CharSequence.class.isInstance(tag)) {
                tag = null;
            }
        }
        if (((CharSequence) tag) != null && view.isShown() && view.getWindowVisibility() == 0) {
            z7 = true;
        } else {
            z7 = false;
        }
        int i9 = 32;
        if (view.getAccessibilityLiveRegion() == 0 && !z7) {
            if (i7 == 32) {
                AccessibilityEvent obtain = AccessibilityEvent.obtain();
                view.onInitializeAccessibilityEvent(obtain);
                obtain.setEventType(32);
                obtain.setContentChangeTypes(i7);
                obtain.setSource(view);
                view.onPopulateAccessibilityEvent(obtain);
                List<CharSequence> text = obtain.getText();
                if (i8 >= 28) {
                    charSequence = H.b(view);
                } else {
                    Object tag2 = view.getTag(R.id.tag_accessibility_pane_title);
                    if (CharSequence.class.isInstance(tag2)) {
                        charSequence = tag2;
                    }
                }
                text.add(charSequence);
                accessibilityManager.sendAccessibilityEvent(obtain);
                return;
            } else if (view.getParent() != null) {
                try {
                    view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i7);
                    return;
                } catch (AbstractMethodError e3) {
                    Log.e("ViewCompat", view.getParent().getClass().getSimpleName().concat(" does not fully implement ViewParent"), e3);
                    return;
                }
            } else {
                return;
            }
        }
        AccessibilityEvent obtain2 = AccessibilityEvent.obtain();
        if (!z7) {
            i9 = 2048;
        }
        obtain2.setEventType(i9);
        obtain2.setContentChangeTypes(i7);
        if (z7) {
            List<CharSequence> text2 = obtain2.getText();
            if (i8 >= 28) {
                charSequence = H.b(view);
            } else {
                Object tag3 = view.getTag(R.id.tag_accessibility_pane_title);
                if (CharSequence.class.isInstance(tag3)) {
                    charSequence = tag3;
                }
            }
            text2.add(charSequence);
            if (view.getImportantForAccessibility() == 0) {
                view.setImportantForAccessibility(1);
            }
        }
        view.sendAccessibilityEventUnchecked(obtain2);
    }

    public static C0031g e(View view, C0031g c0031g) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Log.d("ViewCompat", "performReceiveContent: " + c0031g + ", view=" + view.getClass().getSimpleName() + "[" + view.getId() + "]");
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return K.b(view, c0031g);
        }
        r rVar = (r) view.getTag(R.id.tag_on_receive_content_listener);
        InterfaceC0042s interfaceC0042s = d;
        if (rVar != null) {
            C0031g a7 = ((P.r) rVar).a(view, c0031g);
            if (a7 == null) {
                return null;
            }
            if (view instanceof InterfaceC0042s) {
                interfaceC0042s = (InterfaceC0042s) view;
            }
            return interfaceC0042s.a(a7);
        }
        if (view instanceof InterfaceC0042s) {
            interfaceC0042s = (InterfaceC0042s) view;
        }
        return interfaceC0042s.a(c0031g);
    }

    public static void f(View view, int i7) {
        ArrayList b7 = b(view);
        for (int i8 = 0; i8 < b7.size(); i8++) {
            if (((L.d) b7.get(i8)).a() == i7) {
                b7.remove(i8);
                return;
            }
        }
    }

    public static void g(View view, L.d dVar, L.s sVar) {
        C0026b c0026b;
        L.d dVar2 = new L.d(null, dVar.f1851b, null, sVar, dVar.f1852c);
        View.AccessibilityDelegate a7 = a(view);
        if (a7 == null) {
            c0026b = null;
        } else if (a7 instanceof C0025a) {
            c0026b = ((C0025a) a7).f1464a;
        } else {
            c0026b = new C0026b(a7);
        }
        if (c0026b == null) {
            c0026b = new C0026b();
        }
        i(view, c0026b);
        f(view, dVar2.a());
        b(view).add(dVar2);
        d(view, 0);
    }

    public static void h(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i7) {
        if (Build.VERSION.SDK_INT >= 29) {
            I.d(view, context, iArr, attributeSet, typedArray, i7, 0);
        }
    }

    public static void i(View view, C0026b c0026b) {
        C0025a c0025a;
        if (c0026b == null && (a(view) instanceof C0025a)) {
            c0026b = new C0026b();
        }
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
        if (c0026b == null) {
            c0025a = null;
        } else {
            c0025a = c0026b.f1467b;
        }
        view.setAccessibilityDelegate(c0025a);
    }

    public static void j(View view, CharSequence charSequence) {
        boolean z7;
        new C0049z(R.id.tag_accessibility_pane_title, CharSequence.class, 8, 28, 0).G(view, charSequence);
        A a7 = f1450e;
        if (charSequence != null) {
            WeakHashMap weakHashMap = a7.f1439q;
            if (view.isShown() && view.getWindowVisibility() == 0) {
                z7 = true;
            } else {
                z7 = false;
            }
            weakHashMap.put(view, Boolean.valueOf(z7));
            view.addOnAttachStateChangeListener(a7);
            if (view.isAttachedToWindow()) {
                view.getViewTreeObserver().addOnGlobalLayoutListener(a7);
                return;
            }
            return;
        }
        a7.f1439q.remove(view);
        view.removeOnAttachStateChangeListener(a7);
        view.getViewTreeObserver().removeOnGlobalLayoutListener(a7);
    }
}
