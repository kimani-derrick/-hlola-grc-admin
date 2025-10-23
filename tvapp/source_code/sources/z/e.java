package z;

import K.N;
import K.O;
import a.AbstractC0189a;
import android.app.ActionBar;
import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import androidx.lifecycle.C0344w;
import androidx.lifecycle.EnumC0337o;
import androidx.lifecycle.InterfaceC0342u;
import androidx.lifecycle.M;
import androidx.lifecycle.P;
import com.boxhdo.android.tv.R;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public abstract class e extends Activity implements InterfaceC0342u {

    /* renamed from: q  reason: collision with root package name */
    public final C0344w f16377q = new C0344w(this);

    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object, K.N] */
    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        M5.g.f(keyEvent, "event");
        View decorView = getWindow().getDecorView();
        M5.g.e(decorView, "window.decorView");
        if (AbstractC0189a.q(decorView, keyEvent)) {
            return true;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            return super.dispatchKeyEvent(keyEvent);
        }
        onUserInteraction();
        Window window = getWindow();
        if (window.hasFeature(8)) {
            ActionBar actionBar = getActionBar();
            if (keyEvent.getKeyCode() == 82 && actionBar != null) {
                if (!AbstractC0189a.f4954a) {
                    try {
                        AbstractC0189a.f4955b = actionBar.getClass().getMethod("onMenuKeyEvent", KeyEvent.class);
                    } catch (NoSuchMethodException unused) {
                    }
                    AbstractC0189a.f4954a = true;
                }
                Method method = AbstractC0189a.f4955b;
                if (method != null) {
                    try {
                        Object invoke = method.invoke(actionBar, keyEvent);
                        if (invoke != null) {
                            if (((Boolean) invoke).booleanValue()) {
                                return true;
                            }
                        }
                    } catch (IllegalAccessException | InvocationTargetException unused2) {
                    }
                }
            }
        }
        if (window.superDispatchKeyEvent(keyEvent)) {
            return true;
        }
        View decorView2 = window.getDecorView();
        Field field = O.f1447a;
        KeyEvent.DispatcherState dispatcherState = null;
        if (Build.VERSION.SDK_INT < 28) {
            ArrayList arrayList = N.d;
            N n = (N) decorView2.getTag(R.id.tag_unhandled_key_event_manager);
            N n7 = n;
            if (n == null) {
                ?? obj = new Object();
                obj.f1444a = null;
                obj.f1445b = null;
                obj.f1446c = null;
                decorView2.setTag(R.id.tag_unhandled_key_event_manager, obj);
                n7 = obj;
            }
            if (keyEvent.getAction() == 0) {
                WeakHashMap weakHashMap = n7.f1444a;
                if (weakHashMap != null) {
                    weakHashMap.clear();
                }
                ArrayList arrayList2 = N.d;
                if (!arrayList2.isEmpty()) {
                    synchronized (arrayList2) {
                        try {
                            if (n7.f1444a == null) {
                                n7.f1444a = new WeakHashMap();
                            }
                            for (int size = arrayList2.size() - 1; size >= 0; size--) {
                                ArrayList arrayList3 = N.d;
                                View view = (View) ((WeakReference) arrayList3.get(size)).get();
                                if (view == null) {
                                    arrayList3.remove(size);
                                } else {
                                    n7.f1444a.put(view, Boolean.TRUE);
                                    for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                                        n7.f1444a.put((View) parent, Boolean.TRUE);
                                    }
                                }
                            }
                        } finally {
                        }
                    }
                }
            }
            View a7 = n7.a(decorView2);
            if (keyEvent.getAction() == 0) {
                int keyCode = keyEvent.getKeyCode();
                if (a7 != null && !KeyEvent.isModifierKey(keyCode)) {
                    if (n7.f1445b == null) {
                        n7.f1445b = new SparseArray();
                    }
                    n7.f1445b.put(keyCode, new WeakReference(a7));
                }
            }
            if (a7 != null) {
                return true;
            }
        }
        if (decorView2 != null) {
            dispatcherState = decorView2.getKeyDispatcherState();
        }
        return keyEvent.dispatch(this, dispatcherState, this);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        M5.g.f(keyEvent, "event");
        View decorView = getWindow().getDecorView();
        M5.g.e(decorView, "window.decorView");
        if (AbstractC0189a.q(decorView, keyEvent)) {
            return true;
        }
        return super.dispatchKeyShortcutEvent(keyEvent);
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int i7 = M.f6766r;
        P.j(this);
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        M5.g.f(bundle, "outState");
        this.f16377q.I(EnumC0337o.f6819s);
        super.onSaveInstanceState(bundle);
    }
}
