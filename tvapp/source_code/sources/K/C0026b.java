package K;

import android.os.Bundle;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeProvider;
import com.boxhdo.android.tv.R;
import com.google.android.gms.internal.measurement.AbstractC0515y1;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;
/* renamed from: K.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0026b {

    /* renamed from: c  reason: collision with root package name */
    public static final View.AccessibilityDelegate f1465c = new View.AccessibilityDelegate();

    /* renamed from: a  reason: collision with root package name */
    public final View.AccessibilityDelegate f1466a;

    /* renamed from: b  reason: collision with root package name */
    public final C0025a f1467b;

    public C0026b() {
        this(f1465c);
    }

    public boolean a(View view, AccessibilityEvent accessibilityEvent) {
        return this.f1466a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public K3.f b(View view) {
        AccessibilityNodeProvider accessibilityNodeProvider = this.f1466a.getAccessibilityNodeProvider(view);
        if (accessibilityNodeProvider != null) {
            return new K3.f(accessibilityNodeProvider);
        }
        return null;
    }

    public void c(View view, AccessibilityEvent accessibilityEvent) {
        this.f1466a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void d(View view, L.i iVar) {
        this.f1466a.onInitializeAccessibilityNodeInfo(view, iVar.f1854a);
    }

    public void e(View view, AccessibilityEvent accessibilityEvent) {
        this.f1466a.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public boolean f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f1466a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public boolean g(View view, int i7, Bundle bundle) {
        ClickableSpan[] clickableSpanArr;
        boolean z7;
        WeakReference weakReference;
        ClickableSpan clickableSpan;
        List list = (List) view.getTag(R.id.tag_accessibility_actions);
        if (list == null) {
            list = Collections.emptyList();
        }
        boolean z8 = false;
        int i8 = 0;
        while (true) {
            clickableSpanArr = null;
            if (i8 >= list.size()) {
                break;
            }
            L.d dVar = (L.d) list.get(i8);
            if (dVar.a() == i7) {
                L.s sVar = dVar.d;
                if (sVar != null) {
                    Class cls = dVar.f1852c;
                    if (cls != null) {
                        try {
                            AbstractC0515y1.v(cls.getDeclaredConstructor(null).newInstance(null));
                            throw null;
                        } catch (Exception e3) {
                            Log.e("A11yActionCompat", "Failed to execute command with argument class ViewCommandArgument: ".concat(cls.getName()), e3);
                        }
                    }
                    z7 = sVar.b(view);
                }
            } else {
                i8++;
            }
        }
        z7 = false;
        if (!z7) {
            z7 = this.f1466a.performAccessibilityAction(view, i7, bundle);
        }
        if (!z7 && i7 == R.id.accessibility_action_clickable_span && bundle != null) {
            int i9 = bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1);
            SparseArray sparseArray = (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
            if (sparseArray != null && (weakReference = (WeakReference) sparseArray.get(i9)) != null && (clickableSpan = (ClickableSpan) weakReference.get()) != null) {
                CharSequence text = view.createAccessibilityNodeInfo().getText();
                if (text instanceof Spanned) {
                    clickableSpanArr = (ClickableSpan[]) ((Spanned) text).getSpans(0, text.length(), ClickableSpan.class);
                }
                int i10 = 0;
                while (true) {
                    if (clickableSpanArr == null || i10 >= clickableSpanArr.length) {
                        break;
                    } else if (clickableSpan.equals(clickableSpanArr[i10])) {
                        clickableSpan.onClick(view);
                        z8 = true;
                        break;
                    } else {
                        i10++;
                    }
                }
            }
            return z8;
        }
        return z7;
    }

    public void h(View view, int i7) {
        this.f1466a.sendAccessibilityEvent(view, i7);
    }

    public void i(View view, AccessibilityEvent accessibilityEvent) {
        this.f1466a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    public C0026b(View.AccessibilityDelegate accessibilityDelegate) {
        this.f1466a = accessibilityDelegate;
        this.f1467b = new C0025a(this);
    }
}
