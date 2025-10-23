package k;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.appcompat.widget.SearchView;
/* renamed from: k.E0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0851E0 extends TouchDelegate {

    /* renamed from: a  reason: collision with root package name */
    public final View f11869a;

    /* renamed from: b  reason: collision with root package name */
    public final Rect f11870b;

    /* renamed from: c  reason: collision with root package name */
    public final Rect f11871c;
    public final Rect d;

    /* renamed from: e  reason: collision with root package name */
    public final int f11872e;
    public boolean f;

    public C0851E0(Rect rect, Rect rect2, SearchView.SearchAutoComplete searchAutoComplete) {
        super(rect, searchAutoComplete);
        int scaledTouchSlop = ViewConfiguration.get(searchAutoComplete.getContext()).getScaledTouchSlop();
        this.f11872e = scaledTouchSlop;
        Rect rect3 = new Rect();
        this.f11870b = rect3;
        Rect rect4 = new Rect();
        this.d = rect4;
        Rect rect5 = new Rect();
        this.f11871c = rect5;
        rect3.set(rect);
        rect4.set(rect);
        int i7 = -scaledTouchSlop;
        rect4.inset(i7, i7);
        rect5.set(rect2);
        this.f11869a = searchAutoComplete;
    }

    @Override // android.view.TouchDelegate
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z7;
        float f;
        int i7;
        boolean z8;
        int x7 = (int) motionEvent.getX();
        int y3 = (int) motionEvent.getY();
        int action = motionEvent.getAction();
        boolean z9 = true;
        if (action != 0) {
            if (action != 1 && action != 2) {
                if (action == 3) {
                    z8 = this.f;
                    this.f = false;
                }
                z7 = true;
                z9 = false;
            } else {
                z8 = this.f;
                if (z8 && !this.d.contains(x7, y3)) {
                    z9 = z8;
                    z7 = false;
                }
            }
            z9 = z8;
            z7 = true;
        } else {
            if (this.f11870b.contains(x7, y3)) {
                this.f = true;
                z7 = true;
            }
            z7 = true;
            z9 = false;
        }
        if (!z9) {
            return false;
        }
        Rect rect = this.f11871c;
        View view = this.f11869a;
        if (z7 && !rect.contains(x7, y3)) {
            f = view.getWidth() / 2;
            i7 = view.getHeight() / 2;
        } else {
            f = x7 - rect.left;
            i7 = y3 - rect.top;
        }
        motionEvent.setLocation(f, i7);
        return view.dispatchTouchEvent(motionEvent);
    }
}
