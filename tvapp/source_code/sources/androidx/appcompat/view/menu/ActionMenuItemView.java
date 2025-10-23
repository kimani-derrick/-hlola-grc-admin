package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import e.AbstractC0565a;
import j.AbstractC0777b;
import j.View$OnTouchListenerC0776a;
import j.i;
import j.j;
import j.k;
import j.q;
import k.C0856H;
import k.InterfaceC0892i;
import p6.d;
/* loaded from: classes.dex */
public class ActionMenuItemView extends C0856H implements q, View.OnClickListener, InterfaceC0892i {

    /* renamed from: A  reason: collision with root package name */
    public i f5386A;

    /* renamed from: B  reason: collision with root package name */
    public View$OnTouchListenerC0776a f5387B;

    /* renamed from: C  reason: collision with root package name */
    public AbstractC0777b f5388C;

    /* renamed from: D  reason: collision with root package name */
    public boolean f5389D;

    /* renamed from: E  reason: collision with root package name */
    public boolean f5390E;
    public final int F;

    /* renamed from: G  reason: collision with root package name */
    public int f5391G;

    /* renamed from: H  reason: collision with root package name */
    public final int f5392H;

    /* renamed from: x  reason: collision with root package name */
    public k f5393x;

    /* renamed from: y  reason: collision with root package name */
    public CharSequence f5394y;

    /* renamed from: z  reason: collision with root package name */
    public Drawable f5395z;

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Resources resources = context.getResources();
        this.f5389D = m();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0565a.f9343c, 0, 0);
        this.F = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
        this.f5392H = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f5391G = -1;
        setSaveEnabled(false);
    }

    @Override // k.InterfaceC0892i
    public final boolean a() {
        return !TextUtils.isEmpty(getText());
    }

    @Override // k.InterfaceC0892i
    public final boolean b() {
        if ((!TextUtils.isEmpty(getText())) && this.f5393x.getIcon() == null) {
            return true;
        }
        return false;
    }

    @Override // j.q
    public final void c(k kVar) {
        int i7;
        this.f5393x = kVar;
        setIcon(kVar.getIcon());
        setTitle(kVar.getTitleCondensed());
        setId(kVar.f11467a);
        if (kVar.isVisible()) {
            i7 = 0;
        } else {
            i7 = 8;
        }
        setVisibility(i7);
        setEnabled(kVar.isEnabled());
        if (kVar.hasSubMenu() && this.f5387B == null) {
            this.f5387B = new View$OnTouchListenerC0776a(this);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    @Override // j.q
    public k getItemData() {
        return this.f5393x;
    }

    public final boolean m() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i7 = configuration.screenWidthDp;
        return i7 >= 480 || (i7 >= 640 && configuration.screenHeightDp >= 480) || configuration.orientation == 2;
    }

    public final void n() {
        CharSequence charSequence;
        boolean z7 = true;
        boolean z8 = !TextUtils.isEmpty(this.f5394y);
        if (this.f5395z != null && ((this.f5393x.f11488y & 4) != 4 || (!this.f5389D && !this.f5390E))) {
            z7 = false;
        }
        boolean z9 = z8 & z7;
        CharSequence charSequence2 = null;
        if (z9) {
            charSequence = this.f5394y;
        } else {
            charSequence = null;
        }
        setText(charSequence);
        CharSequence charSequence3 = this.f5393x.f11480q;
        if (TextUtils.isEmpty(charSequence3)) {
            if (z9) {
                charSequence3 = null;
            } else {
                charSequence3 = this.f5393x.f11470e;
            }
        }
        setContentDescription(charSequence3);
        CharSequence charSequence4 = this.f5393x.f11481r;
        if (TextUtils.isEmpty(charSequence4)) {
            if (!z9) {
                charSequence2 = this.f5393x.f11470e;
            }
            d.G(this, charSequence2);
            return;
        }
        d.G(this, charSequence4);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        i iVar = this.f5386A;
        if (iVar != null) {
            iVar.a(this.f5393x);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f5389D = m();
        n();
    }

    @Override // k.C0856H, android.widget.TextView, android.view.View
    public final void onMeasure(int i7, int i8) {
        int i9;
        int i10;
        boolean z7 = !TextUtils.isEmpty(getText());
        if (z7 && (i10 = this.f5391G) >= 0) {
            super.setPadding(i10, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i7, i8);
        int mode = View.MeasureSpec.getMode(i7);
        int size = View.MeasureSpec.getSize(i7);
        int measuredWidth = getMeasuredWidth();
        int i11 = this.F;
        if (mode == Integer.MIN_VALUE) {
            i9 = Math.min(size, i11);
        } else {
            i9 = i11;
        }
        if (mode != 1073741824 && i11 > 0 && measuredWidth < i9) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(i9, 1073741824), i8);
        }
        if (!z7 && this.f5395z != null) {
            super.setPadding((getMeasuredWidth() - this.f5395z.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        View$OnTouchListenerC0776a view$OnTouchListenerC0776a;
        if (this.f5393x.hasSubMenu() && (view$OnTouchListenerC0776a = this.f5387B) != null && view$OnTouchListenerC0776a.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setCheckable(boolean z7) {
    }

    public void setChecked(boolean z7) {
    }

    public void setExpandedFormat(boolean z7) {
        if (this.f5390E != z7) {
            this.f5390E = z7;
            k kVar = this.f5393x;
            if (kVar != null) {
                j jVar = kVar.n;
                jVar.f11456k = true;
                jVar.o(true);
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f5395z = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i7 = this.f5392H;
            if (intrinsicWidth > i7) {
                intrinsicHeight = (int) (intrinsicHeight * (i7 / intrinsicWidth));
                intrinsicWidth = i7;
            }
            if (intrinsicHeight > i7) {
                intrinsicWidth = (int) (intrinsicWidth * (i7 / intrinsicHeight));
            } else {
                i7 = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i7);
        }
        setCompoundDrawables(drawable, null, null, null);
        n();
    }

    public void setItemInvoker(i iVar) {
        this.f5386A = iVar;
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int i7, int i8, int i9, int i10) {
        this.f5391G = i7;
        super.setPadding(i7, i8, i9, i10);
    }

    public void setPopupCallback(AbstractC0777b abstractC0777b) {
        this.f5388C = abstractC0777b;
    }

    public void setTitle(CharSequence charSequence) {
        this.f5394y = charSequence;
        n();
    }
}
