package com.google.android.material.timepicker;

import android.text.Editable;
import android.text.TextUtils;
/* loaded from: classes.dex */
public final class a extends F3.j {

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ ChipTextInputComboView f9042q;

    public a(ChipTextInputComboView chipTextInputComboView) {
        this.f9042q = chipTextInputComboView;
    }

    @Override // F3.j, android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        boolean isEmpty = TextUtils.isEmpty(editable);
        ChipTextInputComboView chipTextInputComboView = this.f9042q;
        if (isEmpty) {
            chipTextInputComboView.f9015q.setText(String.format(chipTextInputComboView.getResources().getConfiguration().locale, "%02d", Integer.valueOf(Integer.parseInt("00"))));
        } else {
            chipTextInputComboView.f9015q.setText(String.format(chipTextInputComboView.getResources().getConfiguration().locale, "%02d", Integer.valueOf(Integer.parseInt(String.valueOf(editable)))));
        }
    }
}
