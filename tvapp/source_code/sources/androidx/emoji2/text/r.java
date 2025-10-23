package androidx.emoji2.text;

import android.os.Build;
import android.text.Editable;
import android.text.SpanWatcher;
import android.text.Spannable;
import android.text.TextWatcher;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes.dex */
public final class r implements TextWatcher, SpanWatcher {

    /* renamed from: q  reason: collision with root package name */
    public final Object f5865q;

    /* renamed from: r  reason: collision with root package name */
    public final AtomicInteger f5866r = new AtomicInteger(0);

    public r(Object obj) {
        this.f5865q = obj;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        ((TextWatcher) this.f5865q).afterTextChanged(editable);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i8, int i9) {
        ((TextWatcher) this.f5865q).beforeTextChanged(charSequence, i7, i8, i9);
    }

    @Override // android.text.SpanWatcher
    public final void onSpanAdded(Spannable spannable, Object obj, int i7, int i8) {
        if (this.f5866r.get() > 0 && (obj instanceof t)) {
            return;
        }
        ((SpanWatcher) this.f5865q).onSpanAdded(spannable, obj, i7, i8);
    }

    @Override // android.text.SpanWatcher
    public final void onSpanChanged(Spannable spannable, Object obj, int i7, int i8, int i9, int i10) {
        int i11;
        int i12;
        if (this.f5866r.get() > 0 && (obj instanceof t)) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28) {
            if (i7 > i8) {
                i7 = 0;
            }
            if (i9 > i10) {
                i11 = i7;
                i12 = 0;
                ((SpanWatcher) this.f5865q).onSpanChanged(spannable, obj, i11, i8, i12, i10);
            }
        }
        i11 = i7;
        i12 = i9;
        ((SpanWatcher) this.f5865q).onSpanChanged(spannable, obj, i11, i8, i12, i10);
    }

    @Override // android.text.SpanWatcher
    public final void onSpanRemoved(Spannable spannable, Object obj, int i7, int i8) {
        if (this.f5866r.get() > 0 && (obj instanceof t)) {
            return;
        }
        ((SpanWatcher) this.f5865q).onSpanRemoved(spannable, obj, i7, i8);
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i7, int i8, int i9) {
        ((TextWatcher) this.f5865q).onTextChanged(charSequence, i7, i8, i9);
    }
}
