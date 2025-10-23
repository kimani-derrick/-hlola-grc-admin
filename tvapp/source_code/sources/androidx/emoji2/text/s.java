package androidx.emoji2.text;

import android.text.Editable;
import android.text.SpannableStringBuilder;
import java.lang.reflect.Array;
import java.util.ArrayList;
/* loaded from: classes.dex */
public final class s extends SpannableStringBuilder {

    /* renamed from: q  reason: collision with root package name */
    public final Class f5867q;

    /* renamed from: r  reason: collision with root package name */
    public final ArrayList f5868r;

    public s(Class cls, CharSequence charSequence) {
        super(charSequence);
        this.f5868r = new ArrayList();
        android.support.v4.media.session.b.j(cls, "watcherClass cannot be null");
        this.f5867q = cls;
    }

    public final void a() {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.f5868r;
            if (i7 < arrayList.size()) {
                ((r) arrayList.get(i7)).f5866r.incrementAndGet();
                i7++;
            } else {
                return;
            }
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(char c5) {
        super.append(c5);
        return this;
    }

    public final void b() {
        e();
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.f5868r;
            if (i7 < arrayList.size()) {
                ((r) arrayList.get(i7)).onTextChanged(this, 0, length(), length());
                i7++;
            } else {
                return;
            }
        }
    }

    public final r c(Object obj) {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.f5868r;
            if (i7 >= arrayList.size()) {
                return null;
            }
            r rVar = (r) arrayList.get(i7);
            if (rVar.f5865q == obj) {
                return rVar;
            }
            i7++;
        }
    }

    public final boolean d(Object obj) {
        if (obj != null) {
            if (this.f5867q == obj.getClass()) {
                return true;
            }
        }
        return false;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final Editable delete(int i7, int i8) {
        super.delete(i7, i8);
        return this;
    }

    public final void e() {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.f5868r;
            if (i7 < arrayList.size()) {
                ((r) arrayList.get(i7)).f5866r.decrementAndGet();
                i7++;
            } else {
                return;
            }
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanEnd(Object obj) {
        r c5;
        if (d(obj) && (c5 = c(obj)) != null) {
            obj = c5;
        }
        return super.getSpanEnd(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanFlags(Object obj) {
        r c5;
        if (d(obj) && (c5 = c(obj)) != null) {
            obj = c5;
        }
        return super.getSpanFlags(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanStart(Object obj) {
        r c5;
        if (d(obj) && (c5 = c(obj)) != null) {
            obj = c5;
        }
        return super.getSpanStart(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final Object[] getSpans(int i7, int i8, Class cls) {
        if (this.f5867q == cls) {
            r[] rVarArr = (r[]) super.getSpans(i7, i8, r.class);
            Object[] objArr = (Object[]) Array.newInstance(cls, rVarArr.length);
            for (int i9 = 0; i9 < rVarArr.length; i9++) {
                objArr[i9] = rVarArr[i9].f5865q;
            }
            return objArr;
        }
        return super.getSpans(i7, i8, cls);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final Editable insert(int i7, CharSequence charSequence) {
        super.insert(i7, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int nextSpanTransition(int i7, int i8, Class cls) {
        return super.nextSpanTransition(i7, i8, (cls == null || this.f5867q == cls) ? r.class : r.class);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void removeSpan(Object obj) {
        r rVar;
        if (d(obj)) {
            rVar = c(obj);
            if (rVar != null) {
                obj = rVar;
            }
        } else {
            rVar = null;
        }
        super.removeSpan(obj);
        if (rVar != null) {
            this.f5868r.remove(rVar);
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final /* bridge */ /* synthetic */ Editable replace(int i7, int i8, CharSequence charSequence) {
        replace(i7, i8, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void setSpan(Object obj, int i7, int i8, int i9) {
        if (d(obj)) {
            r rVar = new r(obj);
            this.f5868r.add(rVar);
            obj = rVar;
        }
        super.setSpan(obj, i7, i8, i9);
    }

    @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
    public final CharSequence subSequence(int i7, int i8) {
        return new s(this.f5867q, this, i7, i8);
    }

    public s(Class cls, CharSequence charSequence, int i7, int i8) {
        super(charSequence, i7, i8);
        this.f5868r = new ArrayList();
        android.support.v4.media.session.b.j(cls, "watcherClass cannot be null");
        this.f5867q = cls;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder delete(int i7, int i8) {
        super.delete(i7, i8);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final Editable insert(int i7, CharSequence charSequence, int i8, int i9) {
        super.insert(i7, charSequence, i8, i9);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final /* bridge */ /* synthetic */ Editable replace(int i7, int i8, CharSequence charSequence, int i9, int i10) {
        replace(i7, i8, charSequence, i9, i10);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(CharSequence charSequence, int i7, int i8) {
        super.append(charSequence, i7, i8);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder insert(int i7, CharSequence charSequence) {
        super.insert(i7, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder replace(int i7, int i8, CharSequence charSequence) {
        a();
        super.replace(i7, i8, charSequence);
        e();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(char c5) {
        super.append(c5);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder insert(int i7, CharSequence charSequence, int i8, int i9) {
        super.insert(i7, charSequence, i8, i9);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder replace(int i7, int i8, CharSequence charSequence, int i9, int i10) {
        a();
        super.replace(i7, i8, charSequence, i9, i10);
        e();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(CharSequence charSequence, int i7, int i8) {
        super.append(charSequence, i7, i8);
        return this;
    }

    @Override // android.text.SpannableStringBuilder
    public final SpannableStringBuilder append(CharSequence charSequence, Object obj, int i7) {
        super.append(charSequence, obj, i7);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(char c5) {
        super.append(c5);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i7, int i8) {
        super.append(charSequence, i7, i8);
        return this;
    }
}
