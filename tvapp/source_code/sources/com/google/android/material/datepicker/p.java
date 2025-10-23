package com.google.android.material.datepicker;

import K.C0049z;
import K.O;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.boxhdo.android.tv.R;
import java.lang.reflect.Field;
import w0.k0;
/* loaded from: classes.dex */
public final class p extends k0 {

    /* renamed from: u  reason: collision with root package name */
    public final TextView f8903u;

    /* renamed from: v  reason: collision with root package name */
    public final MaterialCalendarGridView f8904v;

    public p(LinearLayout linearLayout, boolean z7) {
        super(linearLayout);
        TextView textView = (TextView) linearLayout.findViewById(R.id.month_title);
        this.f8903u = textView;
        Field field = O.f1447a;
        new C0049z(R.id.tag_accessibility_heading, Boolean.class, 0, 28, 1).G(textView, Boolean.TRUE);
        this.f8904v = (MaterialCalendarGridView) linearLayout.findViewById(R.id.month_grid);
        if (!z7) {
            textView.setVisibility(8);
        }
    }
}
