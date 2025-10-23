package androidx.leanback.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.boxhdo.android.tv.R;
/* loaded from: classes.dex */
public class TitleView extends FrameLayout implements N0 {

    /* renamed from: q  reason: collision with root package name */
    public final ImageView f6557q;

    /* renamed from: r  reason: collision with root package name */
    public final TextView f6558r;

    /* renamed from: s  reason: collision with root package name */
    public final SearchOrbView f6559s;

    /* renamed from: t  reason: collision with root package name */
    public int f6560t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f6561u;

    /* renamed from: v  reason: collision with root package name */
    public final M0 f6562v;

    public TitleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.browseTitleViewStyle);
        this.f6560t = 6;
        this.f6561u = false;
        this.f6562v = new M0(this);
        View inflate = LayoutInflater.from(context).inflate(R.layout.lb_title_view, this);
        this.f6557q = (ImageView) inflate.findViewById(R.id.title_badge);
        this.f6558r = (TextView) inflate.findViewById(R.id.title_text);
        this.f6559s = (SearchOrbView) inflate.findViewById(R.id.title_orb);
        setClipToPadding(false);
        setClipChildren(false);
    }

    public final void a() {
        ImageView imageView = this.f6557q;
        Drawable drawable = imageView.getDrawable();
        TextView textView = this.f6558r;
        if (drawable != null) {
            imageView.setVisibility(0);
            textView.setVisibility(8);
            return;
        }
        imageView.setVisibility(8);
        textView.setVisibility(0);
    }

    public Drawable getBadgeDrawable() {
        return this.f6557q.getDrawable();
    }

    public t0 getSearchAffordanceColors() {
        return this.f6559s.getOrbColors();
    }

    public View getSearchAffordanceView() {
        return this.f6559s;
    }

    public CharSequence getTitle() {
        return this.f6558r.getText();
    }

    @Override // androidx.leanback.widget.N0
    public O0 getTitleViewAdapter() {
        return this.f6562v;
    }

    public void setBadgeDrawable(Drawable drawable) {
        this.f6557q.setImageDrawable(drawable);
        a();
    }

    public void setOnSearchClickedListener(View.OnClickListener onClickListener) {
        boolean z7;
        int i7 = 0;
        if (onClickListener != null) {
            z7 = true;
        } else {
            z7 = false;
        }
        this.f6561u = z7;
        this.f6559s.setOnOrbClickedListener(onClickListener);
        if (!this.f6561u || (this.f6560t & 4) != 4) {
            i7 = 4;
        }
        this.f6559s.setVisibility(i7);
    }

    public void setSearchAffordanceColors(t0 t0Var) {
        this.f6559s.setOrbColors(t0Var);
    }

    public void setTitle(CharSequence charSequence) {
        this.f6558r.setText(charSequence);
        a();
    }
}
