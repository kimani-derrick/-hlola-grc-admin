package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.os.LocaleList;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Checkable;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.boxhdo.android.tv.R;
import com.google.android.material.chip.Chip;
import com.google.android.material.textfield.TextInputLayout;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class ChipTextInputComboView extends FrameLayout implements Checkable {

    /* renamed from: q  reason: collision with root package name */
    public final Chip f9015q;

    /* renamed from: r  reason: collision with root package name */
    public final EditText f9016r;

    public ChipTextInputComboView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        LocaleList locales;
        LayoutInflater from = LayoutInflater.from(context);
        Chip chip = (Chip) from.inflate(R.layout.material_time_chip, (ViewGroup) this, false);
        this.f9015q = chip;
        TextInputLayout textInputLayout = (TextInputLayout) from.inflate(R.layout.material_time_input, (ViewGroup) this, false);
        EditText editText = textInputLayout.getEditText();
        this.f9016r = editText;
        editText.setVisibility(4);
        editText.addTextChangedListener(new a(this));
        if (Build.VERSION.SDK_INT >= 24) {
            locales = getContext().getResources().getConfiguration().getLocales();
            editText.setImeHintLocales(locales);
        }
        addView(chip);
        addView(textInputLayout);
        TextView textView = (TextView) findViewById(R.id.material_label);
        editText.setSaveEnabled(false);
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f9015q.isChecked();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        LocaleList locales;
        super.onConfigurationChanged(configuration);
        if (Build.VERSION.SDK_INT >= 24) {
            locales = getContext().getResources().getConfiguration().getLocales();
            this.f9016r.setImeHintLocales(locales);
        }
    }

    @Override // android.widget.Checkable
    public final void setChecked(boolean z7) {
        int i7;
        Chip chip = this.f9015q;
        chip.setChecked(z7);
        int i8 = 0;
        if (z7) {
            i7 = 0;
        } else {
            i7 = 4;
        }
        EditText editText = this.f9016r;
        editText.setVisibility(i7);
        if (z7) {
            i8 = 8;
        }
        chip.setVisibility(i8);
        if (chip.isChecked()) {
            editText.requestFocus();
            if (!TextUtils.isEmpty(editText.getText())) {
                editText.setSelection(editText.getText().length());
            }
        }
    }

    @Override // android.view.View
    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.f9015q.setOnClickListener(onClickListener);
    }

    @Override // android.view.View
    public final void setTag(int i7, Object obj) {
        this.f9015q.setTag(i7, obj);
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        this.f9015q.toggle();
    }
}
