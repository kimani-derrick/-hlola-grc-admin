package j;

import android.view.View;
import android.view.ViewConfiguration;
import androidx.appcompat.view.menu.ActionMenuItemView;
import k.C0884e;
import k.C0886f;
import k.C0888g;
import k.C0890h;
import k.RunnableC0879b0;
/* renamed from: j.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class View$OnTouchListenerC0776a implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ View f11395A;

    /* renamed from: q  reason: collision with root package name */
    public final float f11396q;

    /* renamed from: r  reason: collision with root package name */
    public final int f11397r;

    /* renamed from: s  reason: collision with root package name */
    public final int f11398s;

    /* renamed from: t  reason: collision with root package name */
    public final View f11399t;

    /* renamed from: u  reason: collision with root package name */
    public RunnableC0879b0 f11400u;

    /* renamed from: v  reason: collision with root package name */
    public RunnableC0879b0 f11401v;

    /* renamed from: w  reason: collision with root package name */
    public boolean f11402w;

    /* renamed from: x  reason: collision with root package name */
    public int f11403x;

    /* renamed from: y  reason: collision with root package name */
    public final int[] f11404y;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ int f11405z;

    public View$OnTouchListenerC0776a(View view) {
        this.f11404y = new int[2];
        this.f11399t = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f11396q = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f11397r = tapTimeout;
        this.f11398s = (ViewConfiguration.getLongPressTimeout() + tapTimeout) / 2;
    }

    public final void a() {
        RunnableC0879b0 runnableC0879b0 = this.f11401v;
        View view = this.f11399t;
        if (runnableC0879b0 != null) {
            view.removeCallbacks(runnableC0879b0);
        }
        RunnableC0879b0 runnableC0879b02 = this.f11400u;
        if (runnableC0879b02 != null) {
            view.removeCallbacks(runnableC0879b02);
        }
    }

    public final l b() {
        C0884e c0884e;
        switch (this.f11405z) {
            case 0:
                AbstractC0777b abstractC0777b = ((ActionMenuItemView) this.f11395A).f5388C;
                if (abstractC0777b == null || (c0884e = ((C0886f) abstractC0777b).f12005a.f12014I) == null) {
                    return null;
                }
                return c0884e.e();
            default:
                C0884e c0884e2 = ((C0888g) this.f11395A).f12006t.f12013H;
                if (c0884e2 == null) {
                    return null;
                }
                return c0884e2.e();
        }
    }

    public final boolean c() {
        l b7;
        switch (this.f11405z) {
            case 0:
                ActionMenuItemView actionMenuItemView = (ActionMenuItemView) this.f11395A;
                i iVar = actionMenuItemView.f5386A;
                if (iVar == null || !iVar.a(actionMenuItemView.f5393x) || (b7 = b()) == null || !b7.h()) {
                    return false;
                }
                return true;
            default:
                ((C0888g) this.f11395A).f12006t.i();
                return true;
        }
    }

    public boolean d() {
        switch (this.f11405z) {
            case 1:
                C0890h c0890h = ((C0888g) this.f11395A).f12006t;
                if (c0890h.f12015J != null) {
                    return false;
                }
                c0890h.h();
                return true;
            default:
                return e();
        }
    }

    public final boolean e() {
        l b7 = b();
        if (b7 != null && b7.h()) {
            b7.dismiss();
            return true;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x005b, code lost:
        if (r14 != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x007d, code lost:
        if (r4 != 3) goto L61;
     */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0102  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouch(android.view.View r13, android.view.MotionEvent r14) {
        /*
            Method dump skipped, instructions count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j.View$OnTouchListenerC0776a.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f11402w = false;
        this.f11403x = -1;
        RunnableC0879b0 runnableC0879b0 = this.f11400u;
        if (runnableC0879b0 != null) {
            this.f11399t.removeCallbacks(runnableC0879b0);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public View$OnTouchListenerC0776a(ActionMenuItemView actionMenuItemView) {
        this((View) actionMenuItemView);
        this.f11405z = 0;
        this.f11395A = actionMenuItemView;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public View$OnTouchListenerC0776a(C0888g c0888g, View view) {
        this(view);
        this.f11405z = 1;
        this.f11395A = c0888g;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
