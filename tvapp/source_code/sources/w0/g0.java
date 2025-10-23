package w0;
/* loaded from: classes.dex */
public final class g0 {

    /* renamed from: a  reason: collision with root package name */
    public int f15539a;

    /* renamed from: b  reason: collision with root package name */
    public int f15540b;

    /* renamed from: c  reason: collision with root package name */
    public int f15541c;
    public int d;

    /* renamed from: e  reason: collision with root package name */
    public int f15542e;
    public boolean f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f15543g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f15544h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f15545i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f15546j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f15547k;

    /* renamed from: l  reason: collision with root package name */
    public int f15548l;

    /* renamed from: m  reason: collision with root package name */
    public long f15549m;
    public int n;

    /* renamed from: o  reason: collision with root package name */
    public int f15550o;

    /* renamed from: p  reason: collision with root package name */
    public int f15551p;

    public final void a(int i7) {
        if ((this.d & i7) != 0) {
            return;
        }
        throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i7) + " but it is " + Integer.toBinaryString(this.d));
    }

    public final int b() {
        if (this.f15543g) {
            return this.f15540b - this.f15541c;
        }
        return this.f15542e;
    }

    public final String toString() {
        return "State{mTargetPosition=" + this.f15539a + ", mData=null, mItemCount=" + this.f15542e + ", mIsMeasuring=" + this.f15545i + ", mPreviousLayoutItemCount=" + this.f15540b + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f15541c + ", mStructureChanged=" + this.f + ", mInPreLayout=" + this.f15543g + ", mRunSimpleAnimations=" + this.f15546j + ", mRunPredictiveAnimations=" + this.f15547k + '}';
    }
}
