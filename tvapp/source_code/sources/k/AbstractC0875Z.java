package k;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.boxhdo.android.tv.R;
import java.lang.reflect.InvocationTargetException;
/* renamed from: k.Z  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0875Z extends ListView {

    /* renamed from: A  reason: collision with root package name */
    public P.h f11970A;

    /* renamed from: B  reason: collision with root package name */
    public P.b f11971B;

    /* renamed from: q  reason: collision with root package name */
    public final Rect f11972q;

    /* renamed from: r  reason: collision with root package name */
    public int f11973r;

    /* renamed from: s  reason: collision with root package name */
    public int f11974s;

    /* renamed from: t  reason: collision with root package name */
    public int f11975t;

    /* renamed from: u  reason: collision with root package name */
    public int f11976u;

    /* renamed from: v  reason: collision with root package name */
    public int f11977v;

    /* renamed from: w  reason: collision with root package name */
    public C0873X f11978w;

    /* renamed from: x  reason: collision with root package name */
    public boolean f11979x;

    /* renamed from: y  reason: collision with root package name */
    public final boolean f11980y;

    /* renamed from: z  reason: collision with root package name */
    public boolean f11981z;

    public AbstractC0875Z(Context context, boolean z7) {
        super(context, null, R.attr.dropDownListViewStyle);
        this.f11972q = new Rect();
        this.f11973r = 0;
        this.f11974s = 0;
        this.f11975t = 0;
        this.f11976u = 0;
        this.f11980y = z7;
        setCacheColorHint(0);
    }

    public final int a(int i7, int i8) {
        int makeMeasureSpec;
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        int i9 = listPaddingTop + listPaddingBottom;
        if (adapter == null) {
            return i9;
        }
        dividerHeight = (dividerHeight <= 0 || divider == null) ? 0 : 0;
        int count = adapter.getCount();
        int i10 = 0;
        View view = null;
        for (int i11 = 0; i11 < count; i11++) {
            int itemViewType = adapter.getItemViewType(i11);
            if (itemViewType != i10) {
                view = null;
                i10 = itemViewType;
            }
            view = adapter.getView(i11, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i12 = layoutParams.height;
            if (i12 > 0) {
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i12, 1073741824);
            } else {
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            }
            view.measure(i7, makeMeasureSpec);
            view.forceLayout();
            if (i11 > 0) {
                i9 += dividerHeight;
            }
            i9 += view.getMeasuredHeight();
            if (i9 >= i8) {
                return i8;
            }
        }
        return i9;
    }

    /* JADX WARN: Removed duplicated region for block: B:81:0x0147 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0179  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b(android.view.MotionEvent r17, int r18) {
        /*
            Method dump skipped, instructions count: 392
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k.AbstractC0875Z.b(android.view.MotionEvent, int):boolean");
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Drawable selector;
        Rect rect = this.f11972q;
        if (!rect.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(rect);
            selector.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        if (this.f11971B != null) {
            return;
        }
        super.drawableStateChanged();
        C0873X c0873x = this.f11978w;
        if (c0873x != null) {
            c0873x.f11967r = true;
        }
        Drawable selector = getSelector();
        if (selector != null && this.f11981z && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean hasFocus() {
        if (!this.f11980y && !super.hasFocus()) {
            return false;
        }
        return true;
    }

    @Override // android.view.View
    public final boolean hasWindowFocus() {
        if (!this.f11980y && !super.hasWindowFocus()) {
            return false;
        }
        return true;
    }

    @Override // android.view.View
    public final boolean isFocused() {
        if (!this.f11980y && !super.isFocused()) {
            return false;
        }
        return true;
    }

    @Override // android.view.View
    public final boolean isInTouchMode() {
        if ((this.f11980y && this.f11979x) || super.isInTouchMode()) {
            return true;
        }
        return false;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.f11971B = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int i7 = Build.VERSION.SDK_INT;
        if (i7 < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f11971B == null) {
            P.b bVar = new P.b(12, this);
            this.f11971B = bVar;
            post(bVar);
        }
        boolean onHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked != 9 && actionMasked != 7) {
            setSelection(-1);
        } else {
            int pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
            if (pointToPosition != -1 && pointToPosition != getSelectedItemPosition()) {
                View childAt = getChildAt(pointToPosition - getFirstVisiblePosition());
                if (childAt.isEnabled()) {
                    requestFocus();
                    if (i7 >= 30 && AbstractC0871V.d) {
                        try {
                            AbstractC0871V.f11957a.invoke(this, Integer.valueOf(pointToPosition), childAt, Boolean.FALSE, -1, -1);
                            AbstractC0871V.f11958b.invoke(this, Integer.valueOf(pointToPosition));
                            AbstractC0871V.f11959c.invoke(this, Integer.valueOf(pointToPosition));
                        } catch (IllegalAccessException | InvocationTargetException e3) {
                            e3.printStackTrace();
                        }
                    } else {
                        setSelectionFromTop(pointToPosition, childAt.getTop() - getTop());
                    }
                }
                Drawable selector = getSelector();
                if (selector != null && this.f11981z && isPressed()) {
                    selector.setState(getDrawableState());
                }
            }
        }
        return onHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f11977v = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        P.b bVar = this.f11971B;
        if (bVar != null) {
            AbstractC0875Z abstractC0875Z = (AbstractC0875Z) bVar.f2739r;
            abstractC0875Z.f11971B = null;
            abstractC0875Z.removeCallbacks(bVar);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListSelectionHidden(boolean z7) {
        this.f11979x = z7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [k.X, android.graphics.drawable.Drawable$Callback, android.graphics.drawable.Drawable] */
    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        C0873X c0873x = null;
        if (drawable != 0) {
            ?? drawable2 = new Drawable();
            Drawable drawable3 = drawable2.f11966q;
            if (drawable3 != null) {
                drawable3.setCallback(null);
            }
            drawable2.f11966q = drawable;
            drawable.setCallback(drawable2);
            drawable2.f11967r = true;
            c0873x = drawable2;
        }
        this.f11978w = c0873x;
        super.setSelector(c0873x);
        Rect rect = new Rect();
        if (drawable != 0) {
            drawable.getPadding(rect);
        }
        this.f11973r = rect.left;
        this.f11974s = rect.top;
        this.f11975t = rect.right;
        this.f11976u = rect.bottom;
    }
}
