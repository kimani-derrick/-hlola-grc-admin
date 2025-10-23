package androidx.appcompat.view.menu;

import K.O;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import com.boxhdo.android.tv.R;
import e.AbstractC0565a;
import g5.b;
import j.k;
import j.q;
import java.lang.reflect.Field;
/* loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements q, AbsListView.SelectionBoundsAdjuster {

    /* renamed from: A  reason: collision with root package name */
    public final int f5397A;

    /* renamed from: B  reason: collision with root package name */
    public final Context f5398B;

    /* renamed from: C  reason: collision with root package name */
    public boolean f5399C;

    /* renamed from: D  reason: collision with root package name */
    public final Drawable f5400D;

    /* renamed from: E  reason: collision with root package name */
    public final boolean f5401E;
    public LayoutInflater F;

    /* renamed from: G  reason: collision with root package name */
    public boolean f5402G;

    /* renamed from: q  reason: collision with root package name */
    public k f5403q;

    /* renamed from: r  reason: collision with root package name */
    public ImageView f5404r;

    /* renamed from: s  reason: collision with root package name */
    public RadioButton f5405s;

    /* renamed from: t  reason: collision with root package name */
    public TextView f5406t;

    /* renamed from: u  reason: collision with root package name */
    public CheckBox f5407u;

    /* renamed from: v  reason: collision with root package name */
    public TextView f5408v;

    /* renamed from: w  reason: collision with root package name */
    public ImageView f5409w;

    /* renamed from: x  reason: collision with root package name */
    public ImageView f5410x;

    /* renamed from: y  reason: collision with root package name */
    public LinearLayout f5411y;

    /* renamed from: z  reason: collision with root package name */
    public final Drawable f5412z;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        b C3 = b.C(getContext(), attributeSet, AbstractC0565a.f9352o, R.attr.listMenuViewStyle, 0);
        this.f5412z = C3.z(5);
        TypedArray typedArray = (TypedArray) C3.f10842s;
        this.f5397A = typedArray.getResourceId(1, -1);
        this.f5399C = typedArray.getBoolean(7, false);
        this.f5398B = context;
        this.f5400D = C3.z(8);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{16843049}, R.attr.dropDownListViewStyle, 0);
        this.f5401E = obtainStyledAttributes.hasValue(0);
        C3.D();
        obtainStyledAttributes.recycle();
    }

    private LayoutInflater getInflater() {
        if (this.F == null) {
            this.F = LayoutInflater.from(getContext());
        }
        return this.F;
    }

    private void setSubMenuArrowVisible(boolean z7) {
        ImageView imageView = this.f5409w;
        if (imageView != null) {
            imageView.setVisibility(z7 ? 0 : 8);
        }
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public final void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f5410x;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f5410x.getLayoutParams();
        rect.top = this.f5410x.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin + rect.top;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0056, code lost:
        if (r0 != 0) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0113  */
    @Override // j.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(j.k r11) {
        /*
            Method dump skipped, instructions count: 307
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.ListMenuItemView.c(j.k):void");
    }

    @Override // j.q
    public k getItemData() {
        return this.f5403q;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        Field field = O.f1447a;
        setBackground(this.f5412z);
        TextView textView = (TextView) findViewById(R.id.title);
        this.f5406t = textView;
        int i7 = this.f5397A;
        if (i7 != -1) {
            textView.setTextAppearance(this.f5398B, i7);
        }
        this.f5408v = (TextView) findViewById(R.id.shortcut);
        ImageView imageView = (ImageView) findViewById(R.id.submenuarrow);
        this.f5409w = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f5400D);
        }
        this.f5410x = (ImageView) findViewById(R.id.group_divider);
        this.f5411y = (LinearLayout) findViewById(R.id.content);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i7, int i8) {
        if (this.f5404r != null && this.f5399C) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f5404r.getLayoutParams();
            int i9 = layoutParams.height;
            if (i9 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i9;
            }
        }
        super.onMeasure(i7, i8);
    }

    public void setCheckable(boolean z7) {
        CompoundButton compoundButton;
        View view;
        if (!z7 && this.f5405s == null && this.f5407u == null) {
            return;
        }
        if ((this.f5403q.f11487x & 4) != 0) {
            if (this.f5405s == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f5405s = radioButton;
                LinearLayout linearLayout = this.f5411y;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f5405s;
            view = this.f5407u;
        } else {
            if (this.f5407u == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f5407u = checkBox;
                LinearLayout linearLayout2 = this.f5411y;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f5407u;
            view = this.f5405s;
        }
        if (z7) {
            compoundButton.setChecked(this.f5403q.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (view != null && view.getVisibility() != 8) {
                view.setVisibility(8);
                return;
            }
            return;
        }
        CheckBox checkBox2 = this.f5407u;
        if (checkBox2 != null) {
            checkBox2.setVisibility(8);
        }
        RadioButton radioButton2 = this.f5405s;
        if (radioButton2 != null) {
            radioButton2.setVisibility(8);
        }
    }

    public void setChecked(boolean z7) {
        CompoundButton compoundButton;
        if ((this.f5403q.f11487x & 4) != 0) {
            if (this.f5405s == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f5405s = radioButton;
                LinearLayout linearLayout = this.f5411y;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f5405s;
        } else {
            if (this.f5407u == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f5407u = checkBox;
                LinearLayout linearLayout2 = this.f5411y;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f5407u;
        }
        compoundButton.setChecked(z7);
    }

    public void setForceShowIcon(boolean z7) {
        this.f5402G = z7;
        this.f5399C = z7;
    }

    public void setGroupDividerEnabled(boolean z7) {
        ImageView imageView = this.f5410x;
        if (imageView != null) {
            imageView.setVisibility((this.f5401E || !z7) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        this.f5403q.n.getClass();
        boolean z7 = this.f5402G;
        if (!z7 && !this.f5399C) {
            return;
        }
        ImageView imageView = this.f5404r;
        if (imageView == null && drawable == null && !this.f5399C) {
            return;
        }
        if (imageView == null) {
            ImageView imageView2 = (ImageView) getInflater().inflate(R.layout.abc_list_menu_item_icon, (ViewGroup) this, false);
            this.f5404r = imageView2;
            LinearLayout linearLayout = this.f5411y;
            if (linearLayout != null) {
                linearLayout.addView(imageView2, 0);
            } else {
                addView(imageView2, 0);
            }
        }
        if (drawable == null && !this.f5399C) {
            this.f5404r.setVisibility(8);
            return;
        }
        ImageView imageView3 = this.f5404r;
        if (!z7) {
            drawable = null;
        }
        imageView3.setImageDrawable(drawable);
        if (this.f5404r.getVisibility() != 0) {
            this.f5404r.setVisibility(0);
        }
    }

    public void setTitle(CharSequence charSequence) {
        int i7;
        TextView textView;
        if (charSequence != null) {
            this.f5406t.setText(charSequence);
            if (this.f5406t.getVisibility() == 0) {
                return;
            }
            textView = this.f5406t;
            i7 = 0;
        } else {
            i7 = 8;
            if (this.f5406t.getVisibility() == 8) {
                return;
            }
            textView = this.f5406t;
        }
        textView.setVisibility(i7);
    }
}
