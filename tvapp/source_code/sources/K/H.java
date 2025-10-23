package K;

import android.view.View;
import com.boxhdo.android.tv.R;
import java.util.Objects;
/* loaded from: classes.dex */
public abstract class H {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.view.View$OnUnhandledKeyEventListener, java.lang.Object] */
    public static void a(View view, M m7) {
        o.j jVar = (o.j) view.getTag(R.id.tag_unhandled_key_listeners);
        o.j jVar2 = jVar;
        if (jVar == null) {
            o.j jVar3 = new o.j();
            view.setTag(R.id.tag_unhandled_key_listeners, jVar3);
            jVar2 = jVar3;
        }
        Objects.requireNonNull(m7);
        ?? obj = new Object();
        jVar2.put(m7, obj);
        view.addOnUnhandledKeyEventListener(obj);
    }

    public static CharSequence b(View view) {
        return view.getAccessibilityPaneTitle();
    }

    public static boolean c(View view) {
        return view.isAccessibilityHeading();
    }

    public static boolean d(View view) {
        return view.isScreenReaderFocusable();
    }

    public static void e(View view, M m7) {
        View.OnUnhandledKeyEventListener onUnhandledKeyEventListener;
        o.j jVar = (o.j) view.getTag(R.id.tag_unhandled_key_listeners);
        if (jVar != null && (onUnhandledKeyEventListener = (View.OnUnhandledKeyEventListener) jVar.get(m7)) != null) {
            view.removeOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
        }
    }

    public static <T> T f(View view, int i7) {
        return (T) view.requireViewById(i7);
    }

    public static void g(View view, boolean z7) {
        view.setAccessibilityHeading(z7);
    }

    public static void h(View view, CharSequence charSequence) {
        view.setAccessibilityPaneTitle(charSequence);
    }

    public static void i(View view, M.a aVar) {
        view.setAutofillId(null);
    }

    public static void j(View view, boolean z7) {
        view.setScreenReaderFocusable(z7);
    }
}
