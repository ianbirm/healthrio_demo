package com.example.HealthTrioRestDemo.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class IncentiveResponse {
	@JsonProperty("region")
	private String region;
	
	@JsonProperty("region_code")
	private String region_code;
	
	@JsonProperty("period")
	private int period;
	
	@JsonProperty("pct_md_pa_np_mu_aiu")
	private double pct_md_pa_np_mu_aiu;
	
	@JsonProperty("pct_md_pa_np_mu")
	private double pct_md_pa_np_mu;
	
	@JsonProperty("pct_md_mu_aiu")
	private double pct_md_mu_aiu;
	
	@JsonProperty("pct_md_mu")
	private double pct_md_mu;
	
	@JsonProperty("pct_np_mu_aiu")
	private double pct_np_mu_aiu;
	
	@JsonProperty("pct_np_mu")
	private double pct_np_mu;
	
	@JsonProperty("pct_pa_mu_aiu")
	private double pct_pa_mu_aiu;
	
	@JsonProperty("pct_pa_mu")
	private double pct_pa_mu;
	
	@JsonProperty("pct_hospitals_mu_aiu")
	private double pct_hospitals_mu_aiu;
	
	@JsonProperty("pct_hospitals_mu")
	private double pct_hospitals_mu;
	
	@JsonProperty("pct_cah_small_rural_mu_aiu")
	private double pct_cah_small_rural_mu_aiu;
	
	@JsonProperty("pct_cah_small_rural_mu")
	private double pct_cah_small_rural_mu;
	
	
	
	public IncentiveResponse() {
		super();
	}
	public IncentiveResponse(String region, String region_code, int period, double pct_md_pa_np_mu_aiu,
			double pct_md_pa_np_mu, double pct_md_mu_aiu, double pct_md_mu, double pct_np_mu_aiu, double pct_np_mu,
			double pct_pa_mu_aiu, double pct_pa_mu, double pct_hospitals_mu_aiu, double pct_hospitals_mu,
			double pct_cah_small_rural_mu_aiu, double pct_cah_small_rural_mu) {
		super();
		this.region = region;
		this.region_code = region_code;
		this.period = period;
		this.pct_md_pa_np_mu_aiu = pct_md_pa_np_mu_aiu;
		this.pct_md_pa_np_mu = pct_md_pa_np_mu;
		this.pct_md_mu_aiu = pct_md_mu_aiu;
		this.pct_md_mu = pct_md_mu;
		this.pct_np_mu_aiu = pct_np_mu_aiu;
		this.pct_np_mu = pct_np_mu;
		this.pct_pa_mu_aiu = pct_pa_mu_aiu;
		this.pct_pa_mu = pct_pa_mu;
		this.pct_hospitals_mu_aiu = pct_hospitals_mu_aiu;
		this.pct_hospitals_mu = pct_hospitals_mu;
		this.pct_cah_small_rural_mu_aiu = pct_cah_small_rural_mu_aiu;
		this.pct_cah_small_rural_mu = pct_cah_small_rural_mu;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public String getRegion_code() {
		return region_code;
	}
	public void setRegion_code(String region_code) {
		this.region_code = region_code;
	}
	public int getPeriod() {
		return period;
	}
	public void setPeriod(int period) {
		this.period = period;
	}
	public double getPct_md_pa_np_mu_aiu() {
		return pct_md_pa_np_mu_aiu;
	}
	public void setPct_md_pa_np_mu_aiu(double pct_md_pa_np_mu_aiu) {
		this.pct_md_pa_np_mu_aiu = pct_md_pa_np_mu_aiu;
	}
	public double getPct_md_pa_np_mu() {
		return pct_md_pa_np_mu;
	}
	public void setPct_md_pa_np_mu(double pct_md_pa_np_mu) {
		this.pct_md_pa_np_mu = pct_md_pa_np_mu;
	}
	public double getPct_md_mu_aiu() {
		return pct_md_mu_aiu;
	}
	public void setPct_md_mu_aiu(double pct_md_mu_aiu) {
		this.pct_md_mu_aiu = pct_md_mu_aiu;
	}
	public double getPct_md_mu() {
		return pct_md_mu;
	}
	public void setPct_md_mu(double pct_md_mu) {
		this.pct_md_mu = pct_md_mu;
	}
	public double getPct_np_mu_aiu() {
		return pct_np_mu_aiu;
	}
	public void setPct_np_mu_aiu(double pct_np_mu_aiu) {
		this.pct_np_mu_aiu = pct_np_mu_aiu;
	}
	public double getPct_np_mu() {
		return pct_np_mu;
	}
	public void setPct_np_mu(double pct_np_mu) {
		this.pct_np_mu = pct_np_mu;
	}
	public double getPct_pa_mu_aiu() {
		return pct_pa_mu_aiu;
	}
	public void setPct_pa_mu_aiu(double pct_pa_mu_aiu) {
		this.pct_pa_mu_aiu = pct_pa_mu_aiu;
	}
	public double getPct_pa_mu() {
		return pct_pa_mu;
	}
	public void setPct_pa_mu(double pct_pa_mu) {
		this.pct_pa_mu = pct_pa_mu;
	}
	public double getPct_hospitals_mu_aiu() {
		return pct_hospitals_mu_aiu;
	}
	public void setPct_hospitals_mu_aiu(double pct_hospitals_mu_aiu) {
		this.pct_hospitals_mu_aiu = pct_hospitals_mu_aiu;
	}
	public double getPct_hospitals_mu() {
		return pct_hospitals_mu;
	}
	public void setPct_hospitals_mu(double pct_hospitals_mu) {
		this.pct_hospitals_mu = pct_hospitals_mu;
	}
	public double getPct_cah_small_rural_mu_aiu() {
		return pct_cah_small_rural_mu_aiu;
	}
	public void setPct_cah_small_rural_mu_aiu(double pct_cah_small_rural_mu_aiu) {
		this.pct_cah_small_rural_mu_aiu = pct_cah_small_rural_mu_aiu;
	}
	public double getPct_cah_small_rural_mu() {
		return pct_cah_small_rural_mu;
	}
	public void setPct_cah_small_rural_mu(double pct_cah_small_rural_mu) {
		this.pct_cah_small_rural_mu = pct_cah_small_rural_mu;
	}
	@Override
	public String toString() {
		return "region=" + region + ", region_code=" + region_code + ", period=" + period
				+ ", pct_md_pa_np_mu_aiu=" + pct_md_pa_np_mu_aiu + ", pct_md_pa_np_mu=" + pct_md_pa_np_mu
				+ ", pct_md_mu_aiu=" + pct_md_mu_aiu + ", pct_md_mu=" + pct_md_mu + ", pct_np_mu_aiu=" + pct_np_mu_aiu
				+ ", pct_np_mu=" + pct_np_mu + ", pct_pa_mu_aiu=" + pct_pa_mu_aiu + ", pct_pa_mu=" + pct_pa_mu
				+ ", pct_hospitals_mu_aiu=" + pct_hospitals_mu_aiu + ", pct_hospitals_mu=" + pct_hospitals_mu
				+ ", pct_cah_small_rural_mu_aiu=" + pct_cah_small_rural_mu_aiu + ", pct_cah_small_rural_mu="
				+ pct_cah_small_rural_mu +  "\n";
	}
	
	
	
}
