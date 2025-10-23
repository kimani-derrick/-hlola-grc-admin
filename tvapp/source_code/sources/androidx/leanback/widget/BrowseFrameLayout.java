package androidx.leanback.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.ComponentCallbacksC0269x;
import com.boxhdo.android.tv.R;
/* loaded from: classes.dex */
public class BrowseFrameLayout extends FrameLayout {

    /* renamed from: q  reason: collision with root package name */
    public InterfaceC0296i f6344q;

    /* renamed from: r  reason: collision with root package name */
    public InterfaceC0294h f6345r;

    /* renamed from: s  reason: collision with root package name */
    public View.OnKeyListener f6346s;

    public BrowseFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean dispatchKeyEvent = super.dispatchKeyEvent(keyEvent);
        View.OnKeyListener onKeyListener = this.f6346s;
        return (onKeyListener == null || dispatchKeyEvent) ? dispatchKeyEvent : onKeyListener.onKey(getRootView(), keyEvent.getKeyCode(), keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final View focusSearch(View view, int i7) {
        View k5;
        InterfaceC0296i interfaceC0296i = this.f6344q;
        return (interfaceC0296i == null || (k5 = interfaceC0296i.k(view, i7)) == null) ? super.focusSearch(view, i7) : k5;
    }

    public InterfaceC0294h getOnChildFocusListener() {
        return this.f6345r;
    }

    public InterfaceC0296i getOnFocusSearchListener() {
        return this.f6344q;
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i7, Rect rect) {
        View view;
        androidx.leanback.app.y yVar;
        View view2;
        InterfaceC0294h interfaceC0294h = this.f6345r;
        if (interfaceC0294h != null) {
            androidx.leanback.app.s sVar = ((androidx.leanback.app.i) interfaceC0294h).f6230q;
            if (!sVar.n().f5916I) {
                if (!sVar.f6273b1 || !sVar.f6272a1 || (yVar = sVar.f6263Q0) == null || (view2 = yVar.W) == null || !view2.requestFocus(i7, rect)) {
                    ComponentCallbacksC0269x componentCallbacksC0269x = sVar.f6262P0;
                    if (componentCallbacksC0269x == null || (view = componentCallbacksC0269x.W) == null || !view.requestFocus(i7, rect)) {
                        View view3 = sVar.f6226p0;
                        if (view3 != null && view3.requestFocus(i7, rect)) {
                            return true;
                        }
                    } else {
                        return true;
                    }
                } else {
                    return true;
                }
            } else {
                return true;
            }
        }
        return super.onRequestFocusInDescendants(i7, rect);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        boolean z7;
        InterfaceC0294h interfaceC0294h = this.f6345r;
        if (interfaceC0294h != null) {
            androidx.leanback.app.s sVar = ((androidx.leanback.app.i) interfaceC0294h).f6230q;
            if (!sVar.n().f5916I && sVar.f6273b1 && sVar.f6285p1 == null) {
                int id = view.getId();
                if (id == R.id.browse_container_dock && sVar.f6272a1) {
                    z7 = false;
                } else {
                    z7 = (id == R.id.browse_headers_dock && !sVar.f6272a1) ? true : true;
                }
                sVar.E0(z7);
            }
        }
        super.requestChildFocus(view, view2);
    }

    public void setOnChildFocusListener(InterfaceC0294h interfaceC0294h) {
        this.f6345r = interfaceC0294h;
    }

    public void setOnDispatchKeyListener(View.OnKeyListener onKeyListener) {
        this.f6346s = onKeyListener;
    }

    public void setOnFocusSearchListener(InterfaceC0296i interfaceC0296i) {
        this.f6344q = interfaceC0296i;
    }
}
