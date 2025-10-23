package androidx.leanback.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.boxhdo.android.tv.R;
/* loaded from: classes.dex */
public class ThumbsBar extends LinearLayout {

    /* renamed from: q  reason: collision with root package name */
    public int f6550q;

    /* renamed from: r  reason: collision with root package name */
    public final int f6551r;

    /* renamed from: s  reason: collision with root package name */
    public final int f6552s;

    /* renamed from: t  reason: collision with root package name */
    public final int f6553t;

    /* renamed from: u  reason: collision with root package name */
    public final int f6554u;

    /* renamed from: v  reason: collision with root package name */
    public int f6555v;

    /* renamed from: w  reason: collision with root package name */
    public boolean f6556w;

    public ThumbsBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f6550q = -1;
        new SparseArray();
        this.f6556w = false;
        this.f6551r = context.getResources().getDimensionPixelSize(R.dimen.lb_playback_transport_thumbs_width);
        this.f6552s = context.getResources().getDimensionPixelSize(R.dimen.lb_playback_transport_thumbs_height);
        this.f6554u = context.getResources().getDimensionPixelSize(R.dimen.lb_playback_transport_hero_thumbs_width);
        this.f6553t = context.getResources().getDimensionPixelSize(R.dimen.lb_playback_transport_hero_thumbs_height);
        this.f6555v = context.getResources().getDimensionPixelSize(R.dimen.lb_playback_transport_thumbs_margin);
    }

    public final void a() {
        int i7;
        int i8;
        while (getChildCount() > this.f6550q) {
            removeView(getChildAt(getChildCount() - 1));
        }
        while (true) {
            int childCount = getChildCount();
            int i9 = this.f6550q;
            i7 = this.f6552s;
            i8 = this.f6551r;
            if (childCount >= i9) {
                break;
            }
            addView(new ImageView(getContext()), new LinearLayout.LayoutParams(i8, i7));
        }
        int heroIndex = getHeroIndex();
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            if (heroIndex == i10) {
                layoutParams.width = this.f6553t;
                layoutParams.height = this.f6554u;
            } else {
                layoutParams.width = i8;
                layoutParams.height = i7;
            }
            childAt.setLayoutParams(layoutParams);
        }
    }

    public int getHeroIndex() {
        return getChildCount() / 2;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z7, int i7, int i8, int i9, int i10) {
        super.onLayout(z7, i7, i8, i9, i10);
        int heroIndex = getHeroIndex();
        View childAt = getChildAt(heroIndex);
        int width = (getWidth() / 2) - (childAt.getMeasuredWidth() / 2);
        int measuredWidth = (childAt.getMeasuredWidth() / 2) + (getWidth() / 2);
        childAt.layout(width, getPaddingTop(), measuredWidth, childAt.getMeasuredHeight() + getPaddingTop());
        int measuredHeight = (childAt.getMeasuredHeight() / 2) + getPaddingTop();
        for (int i11 = heroIndex - 1; i11 >= 0; i11--) {
            int i12 = width - this.f6555v;
            View childAt2 = getChildAt(i11);
            childAt2.layout(i12 - childAt2.getMeasuredWidth(), measuredHeight - (childAt2.getMeasuredHeight() / 2), i12, (childAt2.getMeasuredHeight() / 2) + measuredHeight);
            width = i12 - childAt2.getMeasuredWidth();
        }
        while (true) {
            heroIndex++;
            if (heroIndex >= this.f6550q) {
                return;
            }
            int i13 = measuredWidth + this.f6555v;
            View childAt3 = getChildAt(heroIndex);
            childAt3.layout(i13, measuredHeight - (childAt3.getMeasuredHeight() / 2), childAt3.getMeasuredWidth() + i13, (childAt3.getMeasuredHeight() / 2) + measuredHeight);
            measuredWidth = i13 + childAt3.getMeasuredWidth();
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i7, int i8) {
        int i9;
        super.onMeasure(i7, i8);
        int measuredWidth = getMeasuredWidth();
        if (!this.f6556w) {
            int i10 = measuredWidth - this.f6553t;
            int i11 = ((i10 + i9) - 1) / (this.f6551r + this.f6555v);
            if (i11 < 2) {
                i11 = 2;
            } else if ((i11 & 1) != 0) {
                i11++;
            }
            int i12 = i11 + 1;
            if (this.f6550q != i12) {
                this.f6550q = i12;
                a();
            }
        }
    }

    public void setNumberOfThumbs(int i7) {
        this.f6556w = true;
        this.f6550q = i7;
        a();
    }

    public void setThumbSpace(int i7) {
        this.f6555v = i7;
        requestLayout();
    }
}
