package com.google.android.material.datepicker;

import K.D;
import K.O;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.DialogInterface$OnCancelListenerC0263q;
import com.boxhdo.android.tv.R;
import com.google.android.gms.internal.measurement.AbstractC0515y1;
import com.google.android.material.internal.CheckableImageButton;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.LinkedHashSet;
import k3.AbstractC0958a;
/* loaded from: classes.dex */
public final class k<S> extends DialogInterface$OnCancelListenerC0263q {

    /* renamed from: D0  reason: collision with root package name */
    public final LinkedHashSet f8876D0;

    /* renamed from: E0  reason: collision with root package name */
    public final LinkedHashSet f8877E0;

    /* renamed from: F0  reason: collision with root package name */
    public int f8878F0;
    public r G0;

    /* renamed from: H0  reason: collision with root package name */
    public b f8879H0;

    /* renamed from: I0  reason: collision with root package name */
    public j f8880I0;

    /* renamed from: J0  reason: collision with root package name */
    public int f8881J0;

    /* renamed from: K0  reason: collision with root package name */
    public CharSequence f8882K0;

    /* renamed from: L0  reason: collision with root package name */
    public boolean f8883L0;

    /* renamed from: M0  reason: collision with root package name */
    public int f8884M0;

    /* renamed from: N0  reason: collision with root package name */
    public CheckableImageButton f8885N0;

    /* renamed from: O0  reason: collision with root package name */
    public J3.g f8886O0;

    /* renamed from: P0  reason: collision with root package name */
    public Button f8887P0;

    public k() {
        new LinkedHashSet();
        new LinkedHashSet();
        this.f8876D0 = new LinkedHashSet();
        this.f8877E0 = new LinkedHashSet();
    }

    public static int j0(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_content_padding);
        m mVar = new m(u.b());
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.mtrl_calendar_day_width);
        int dimensionPixelOffset2 = resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_month_horizontal_padding);
        int i7 = mVar.f8893t;
        int i8 = dimensionPixelSize * i7;
        return ((i7 - 1) * dimensionPixelOffset2) + i8 + (dimensionPixelOffset * 2);
    }

    public static boolean k0(Context context, int i7) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(AbstractC0958a.E(R.attr.materialCalendarStyle, context, j.class.getCanonicalName()), new int[]{i7});
        boolean z7 = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        return z7;
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0263q, androidx.fragment.app.ComponentCallbacksC0269x
    public final void G(Bundle bundle) {
        super.G(bundle);
        if (bundle == null) {
            bundle = this.f6139v;
        }
        this.f8878F0 = bundle.getInt("OVERRIDE_THEME_RES_ID");
        AbstractC0515y1.t(bundle.getParcelable("DATE_SELECTOR_KEY"));
        this.f8879H0 = (b) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.f8881J0 = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.f8882K0 = bundle.getCharSequence("TITLE_TEXT_KEY");
        this.f8884M0 = bundle.getInt("INPUT_MODE_KEY");
    }

    @Override // androidx.fragment.app.ComponentCallbacksC0269x
    public final View H(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i7;
        int i8;
        if (this.f8883L0) {
            i7 = R.layout.mtrl_picker_fullscreen;
        } else {
            i7 = R.layout.mtrl_picker_dialog;
        }
        View inflate = layoutInflater.inflate(i7, viewGroup);
        Context context = inflate.getContext();
        boolean z7 = true;
        if (this.f8883L0) {
            inflate.findViewById(R.id.mtrl_calendar_frame).setLayoutParams(new LinearLayout.LayoutParams(j0(context), -2));
        } else {
            View findViewById = inflate.findViewById(R.id.mtrl_calendar_main_pane);
            View findViewById2 = inflate.findViewById(R.id.mtrl_calendar_frame);
            findViewById.setLayoutParams(new LinearLayout.LayoutParams(j0(context), -1));
            Resources resources = a0().getResources();
            int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_navigation_bottom_padding) + resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_navigation_top_padding) + resources.getDimensionPixelSize(R.dimen.mtrl_calendar_navigation_height);
            int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.mtrl_calendar_days_of_week_height);
            int i9 = n.f8897t;
            findViewById2.setMinimumHeight(dimensionPixelOffset + dimensionPixelSize + (resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_month_vertical_padding) * (i9 - 1)) + (resources.getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) * i9) + resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_bottom_padding));
        }
        Field field = O.f1447a;
        ((TextView) inflate.findViewById(R.id.mtrl_picker_header_selection_text)).setAccessibilityLiveRegion(1);
        this.f8885N0 = (CheckableImageButton) inflate.findViewById(R.id.mtrl_picker_header_toggle);
        TextView textView = (TextView) inflate.findViewById(R.id.mtrl_picker_title_text);
        CharSequence charSequence = this.f8882K0;
        if (charSequence != null) {
            textView.setText(charSequence);
        } else {
            textView.setText(this.f8881J0);
        }
        this.f8885N0.setTag("TOGGLE_BUTTON_TAG");
        CheckableImageButton checkableImageButton = this.f8885N0;
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16842912}, android.support.v4.media.session.b.i0(context, R.drawable.material_ic_calendar_black_24dp));
        stateListDrawable.addState(new int[0], android.support.v4.media.session.b.i0(context, R.drawable.material_ic_edit_black_24dp));
        checkableImageButton.setImageDrawable(stateListDrawable);
        CheckableImageButton checkableImageButton2 = this.f8885N0;
        if (this.f8884M0 == 0) {
            z7 = false;
        }
        checkableImageButton2.setChecked(z7);
        O.i(this.f8885N0, null);
        CheckableImageButton checkableImageButton3 = this.f8885N0;
        boolean z8 = checkableImageButton3.f8912t;
        Context context2 = checkableImageButton3.getContext();
        if (z8) {
            i8 = R.string.mtrl_picker_toggle_to_calendar_input_mode;
        } else {
            i8 = R.string.mtrl_picker_toggle_to_text_input_mode;
        }
        this.f8885N0.setContentDescription(context2.getString(i8));
        this.f8885N0.setOnClickListener(new L3.e(6, this));
        this.f8887P0 = (Button) inflate.findViewById(R.id.confirm_button);
        throw null;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, com.google.android.material.datepicker.a] */
    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0263q, androidx.fragment.app.ComponentCallbacksC0269x
    public final void R(Bundle bundle) {
        super.R(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.f8878F0);
        m mVar = null;
        bundle.putParcelable("DATE_SELECTOR_KEY", null);
        b bVar = this.f8879H0;
        ?? obj = new Object();
        int i7 = a.f8842b;
        int i8 = a.f8842b;
        long j7 = bVar.f8844q.f8895v;
        long j8 = bVar.f8845r.f8895v;
        obj.f8843a = Long.valueOf(bVar.f8847t.f8895v);
        m mVar2 = this.f8880I0.f8869q0;
        if (mVar2 != null) {
            obj.f8843a = Long.valueOf(mVar2.f8895v);
        }
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("DEEP_COPY_VALIDATOR_KEY", bVar.f8846s);
        m e3 = m.e(j7);
        m e7 = m.e(j8);
        d dVar = (d) bundle2.getParcelable("DEEP_COPY_VALIDATOR_KEY");
        Long l7 = obj.f8843a;
        if (l7 != null) {
            mVar = m.e(l7.longValue());
        }
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", new b(e3, e7, dVar, mVar));
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.f8881J0);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.f8882K0);
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0263q, androidx.fragment.app.ComponentCallbacksC0269x
    public final void S() {
        super.S();
        Window window = h0().getWindow();
        if (this.f8883L0) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.f8886O0);
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = u().getDimensionPixelOffset(R.dimen.mtrl_calendar_dialog_background_inset);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable((Drawable) this.f8886O0, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            window.getDecorView().setOnTouchListener(new D3.a(h0(), rect));
        }
        a0();
        int i7 = this.f8878F0;
        if (i7 != 0) {
            b bVar = this.f8879H0;
            j jVar = new j();
            Bundle bundle = new Bundle();
            bundle.putInt("THEME_RES_ID_KEY", i7);
            bundle.putParcelable("GRID_SELECTOR_KEY", null);
            bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", bVar);
            bundle.putParcelable("CURRENT_MONTH_KEY", bVar.f8847t);
            jVar.d0(bundle);
            this.f8880I0 = jVar;
            r rVar = jVar;
            if (this.f8885N0.f8912t) {
                b bVar2 = this.f8879H0;
                r lVar = new l();
                Bundle bundle2 = new Bundle();
                bundle2.putInt("THEME_RES_ID_KEY", i7);
                bundle2.putParcelable("DATE_SELECTOR_KEY", null);
                bundle2.putParcelable("CALENDAR_CONSTRAINTS_KEY", bVar2);
                lVar.d0(bundle2);
                rVar = lVar;
            }
            this.G0 = rVar;
            o();
            throw null;
        }
        throw null;
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0263q, androidx.fragment.app.ComponentCallbacksC0269x
    public final void T() {
        this.G0.f8907n0.clear();
        super.T();
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0263q
    public final Dialog g0(Bundle bundle) {
        Context a02 = a0();
        a0();
        int i7 = this.f8878F0;
        if (i7 != 0) {
            Dialog dialog = new Dialog(a02, i7);
            Context context = dialog.getContext();
            this.f8883L0 = k0(context, 16843277);
            int E4 = AbstractC0958a.E(R.attr.colorSurface, context, k.class.getCanonicalName());
            J3.g gVar = new J3.g(context, null, R.attr.materialCalendarStyle, 2132017965);
            this.f8886O0 = gVar;
            gVar.h(context);
            this.f8886O0.j(ColorStateList.valueOf(E4));
            J3.g gVar2 = this.f8886O0;
            View decorView = dialog.getWindow().getDecorView();
            Field field = O.f1447a;
            gVar2.i(D.i(decorView));
            return dialog;
        }
        throw null;
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0263q, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        Iterator it = this.f8876D0.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnCancelListener) it.next()).onCancel(dialogInterface);
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0263q, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator it = this.f8877E0.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnDismissListener) it.next()).onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) this.W;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }
}
